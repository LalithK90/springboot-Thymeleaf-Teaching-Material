package cyou.lositha.springehcacheexample.pdfAndExcel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cyou.lositha.springehcacheexample.pdfAndExcel.CommonService.FileHandelService;
import cyou.lositha.springehcacheexample.pdfAndExcel.entity.EmployeePdfAndExcel;
import cyou.lositha.springehcacheexample.pdfAndExcel.service.EmployeePdfAndExcelService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class PdfController {

    private final EmployeePdfAndExcelService employeeService;
    private final FileHandelService fileHandelService;
    private final ServletContext context;

    public PdfController(EmployeePdfAndExcelService employeeService, FileHandelService fileHandelService,
            ServletContext context) {
        this.employeeService = employeeService;
        this.fileHandelService = fileHandelService;
        this.context = context;
    }

    @GetMapping(value = "/pdfAllEmployee")
    public String allEmployeePdfAndExcel(Model model) {
        List<EmployeePdfAndExcel> employees = employeeService.getAllEmployeePdfAndExcel();
        model.addAttribute("employees", employees);
        return "view/employee";
    }

    @GetMapping(value = "/pdf")
    public void allPdf(HttpServletRequest request, HttpServletResponse response) {
        List<EmployeePdfAndExcel> employees = employeeService.getAllEmployeePdfAndExcel();
        boolean isFlag = employeeService.createPdf(employees, context, request, response);

        if (isFlag) {
            String fullPath = request.getServletContext().getRealPath("/resources/report/" + "employees" + ".pdf");
            fileHandelService.fileDownload(fullPath, response, "employees.pdf");
        }

    }

    @GetMapping(value = "/excel")
    public void allExcel(HttpServletRequest request, HttpServletResponse response) {
        List<EmployeePdfAndExcel> employees = employeeService.getAllEmployeePdfAndExcel();
        boolean isFlag = employeeService.createExcell(employees, context, request, response);
        if (isFlag) {
            String fullPath = request.getServletContext().getRealPath("/resources/report/" + "employees" + ".xls");
            fileHandelService.fileDownload(fullPath, response, "employees.xls");

        }

    }

}
