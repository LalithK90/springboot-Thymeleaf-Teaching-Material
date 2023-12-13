package cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.entity.EmployeeT6;
import cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.service.EmployeeT6Service;
import cyou.lositha.springehcacheexample.complete.sixthDay.task6.service.Task6Service;

@Controller
@RequestMapping("/employeeT6")
public class EmployeeT6Controller {

  private final EmployeeT6Service employeeT6Service;
  private final Task6Service task6Service;

  public EmployeeT6Controller(EmployeeT6Service employeeT6Service, Task6Service task6Service) {
    this.employeeT6Service = employeeT6Service;
    this.task6Service = task6Service;
  }

  @GetMapping
  private String findAll(Model model) {
    model.addAttribute("employeeOnes", employeeT6Service.findAll());
    return "sixthDay/employeeT6/employeeT6";
  }

  @GetMapping("/add")
  private String addForm(Model model) {
    model.addAttribute("task5s", task6Service.findAll());
    model.addAttribute("employeeT6", new EmployeeT6());
    return "sixthDay/employeeT6/addEmployeeT6";
  }

  @PostMapping
  public String persist(@ModelAttribute EmployeeT6 employeeT6) {
    employeeT6Service.persist(employeeT6);
    return "redirect:/employeeT6";
  }

  @GetMapping("/edit/{id}")
  private String edit(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeT6", employeeT6Service.findById(id));
    model.addAttribute("task5s", task6Service.findAll());
    return "sixthDay/employeeT6/addEmployeeT6";
  }

  @GetMapping("/view/{id}")
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail", employeeT6Service.findById(id));
    return "sixthDay/employeeT6/employeeT6-detail";
  }

  @GetMapping("/delete/{id}")
  private String deleteOne(@PathVariable("id") Integer id) {
    employeeT6Service.deleteById(id);
    return "redirect:/employeeT6";
  }
}
