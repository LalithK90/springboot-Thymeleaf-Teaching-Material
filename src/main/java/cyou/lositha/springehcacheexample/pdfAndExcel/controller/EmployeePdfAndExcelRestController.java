package cyou.lositha.springehcacheexample.pdfAndExcel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cyou.lositha.springehcacheexample.employeeCrud.service.GenderService;
import cyou.lositha.springehcacheexample.pdfAndExcel.entity.EmployeePdfAndExcel;
import cyou.lositha.springehcacheexample.pdfAndExcel.service.EmployeePdfAndExcelService;

@RestController
public class EmployeePdfAndExcelRestController {
    private final EmployeePdfAndExcelService employeeService;
    private final GenderService genderService;

    public EmployeePdfAndExcelRestController(EmployeePdfAndExcelService employeeService, GenderService genderService) {
        this.employeeService = employeeService;
        this.genderService = genderService;
    }

    @GetMapping("/createEmployeePdfAndExcel")
    public void createEmployeePdfAndExcel() {
        List<EmployeePdfAndExcel> employeePdfAndExcels = new ArrayList<>();
        EmployeePdfAndExcel employee = new EmployeePdfAndExcel("First", "abc@gmail.com", "0123456789", "colombo 11");
        employee.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee);
        EmployeePdfAndExcel employee1 = new EmployeePdfAndExcel("Second", "def@gmail.com", "0234567890", "colombo 10");
        employee1.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee1);
        EmployeePdfAndExcel employee2 = new EmployeePdfAndExcel("Third", "ghi@gmail.com", "2345678901", "colombo 09");
        employee2.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee2);
        EmployeePdfAndExcel employee3 = new EmployeePdfAndExcel("Fourth", "jkl@gmail.com", "3456789012", "colombo 08");
        employee3.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee3);
        EmployeePdfAndExcel employee4 = new EmployeePdfAndExcel("Fifth", "mno@gmail.com", "4567890123", "colombo 07");
        employee4.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee4);
        EmployeePdfAndExcel employee5 = new EmployeePdfAndExcel("Sixth", "pqr@gmail.com", "5678901234", "colombo 06");
        employee5.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee5);
        EmployeePdfAndExcel employee6 = new EmployeePdfAndExcel("Seven", "stu@gmail.com", "6789012345", "colombo 05");
        employee6.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee6);
        EmployeePdfAndExcel employee7 = new EmployeePdfAndExcel("Eight", "vwx@gmail.com", "7890123456", "colombo 04");
        employee7.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee7);
        EmployeePdfAndExcel employee8 = new EmployeePdfAndExcel("Ninth", "yza@gmail.com", "8901234567", "colombo 03");
        employee8.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee8);
        EmployeePdfAndExcel employee9 = new EmployeePdfAndExcel("Tenth", "bcd@gmail.com", "9012345678", "colombo 02");
        employee9.setGender(genderService.findById(1L));
        employeePdfAndExcels.add(employee9);
        // save employeePdfAndExcels
        employeePdfAndExcels.forEach(employeeService::persist);
    }

}
