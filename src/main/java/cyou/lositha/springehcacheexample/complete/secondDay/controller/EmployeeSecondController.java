package cyou.lositha.springehcacheexample.complete.secondDay.controller;

import cyou.lositha.springehcacheexample.complete.secondDay.object.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/second")
public class EmployeeSecondController {

  @GetMapping("/employee/form")
  public String getForm(Model model) {
    model.addAttribute("employeeDb", employeeDb);
    return "secondDay/employee";
  }

  List<Employee> employeeDb = new ArrayList<>();// [{},{},{}]

  @PostMapping(value = { "/employee" })
  public String employeeCheck(@ModelAttribute Employee employee) {
    // employee.setId(1);
    // employee.setName("Lalith");
    // employee.setMobile("07867636363");
    if (employee.getId() % 2 == 0) {
      employee.setName(null);
    }

    employeeDb.add(employee);
    System.out.println("  dasda  " + employee.toString());
    return "redirect:/employee/form";
  }

}
