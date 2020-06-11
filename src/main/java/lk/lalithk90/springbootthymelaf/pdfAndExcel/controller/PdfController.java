package lk.lalithk90.springbootthymelaf.pdfAndExcel.controller;



import lk.lalithk90.springbootthymelaf.pdfAndExcel.CommonService.FileHandelService;
import lk.lalithk90.springbootthymelaf.pdfAndExcel.entity.EmployeePdfAndExcel;
import lk.lalithk90.springbootthymelaf.pdfAndExcel.service.EmployeePdfAndExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class PdfController {

    private final EmployeePdfAndExcelService employeeService;
    private final FileHandelService fileHandelService;
    private final ServletContext context;

    @Autowired
    public PdfController(EmployeePdfAndExcelService employeeService, FileHandelService fileHandelService,
                         ServletContext context) {
        this.employeeService = employeeService;
        this.fileHandelService = fileHandelService;
        this.context = context;
    }


    @GetMapping( value = "/pdfAllEmployee" )
    public String allEmployeePdfAndExcel(Model model) {
        List< EmployeePdfAndExcel > employees = employeeService.getAllEmployeePdfAndExcel();
        model.addAttribute("employees", employees);
        return "view/employee";
    }

    @GetMapping( value = "/pdf" )
    public void allPdf(HttpServletRequest request, HttpServletResponse response) {
        List< EmployeePdfAndExcel > employees = employeeService.getAllEmployeePdfAndExcel();
        boolean isFlag = employeeService.createPdf(employees, context, request, response);

        if ( isFlag ) {
            String fullPath = request.getServletContext().getRealPath("/resources/report/" + "employees" + ".pdf");
            fileHandelService.filedownload(fullPath, response, "employees.pdf");
        }

    }

    @GetMapping( value = "/excel" )
    public void allExcel(HttpServletRequest request, HttpServletResponse response) {
        List< EmployeePdfAndExcel > employees = employeeService.getAllEmployeePdfAndExcel();
        boolean isFlag = employeeService.createExcell(employees, context, request, response);
        if ( isFlag ) {
            String fullPath = request.getServletContext().getRealPath("/resources/report/" + "employees" + ".xls");
            fileHandelService.filedownload(fullPath, response, "employees.xls");

        }

    }


}

