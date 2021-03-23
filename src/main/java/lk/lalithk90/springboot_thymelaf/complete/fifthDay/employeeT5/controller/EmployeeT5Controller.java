package lk.lalithk90.springboot_thymelaf.complete.fifthDay.employeeT5.controller;


import lk.lalithk90.springboot_thymelaf.complete.fifthDay.employeeT5.entity.EmployeeT5;
import lk.lalithk90.springboot_thymelaf.complete.fifthDay.employeeT5.service.EmployeeT5Service;
import lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.service.Task5Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/employeeT5" )
public class EmployeeT5Controller {

  private final EmployeeT5Service employeeT5Service;
  private final Task5Service task5Service;

  public EmployeeT5Controller(EmployeeT5Service employeeT5Service, Task5Service task5Service) {
    this.employeeT5Service = employeeT5Service;
    this.task5Service = task5Service;
  }


  @GetMapping
  private String findAll(Model model) {
    model.addAttribute("employeeOnes", employeeT5Service.findAll());
    return "fifthDay/employeeT5/employeeT5";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
    model.addAttribute("task5s", task5Service.findAll());
     model.addAttribute("employeeT5",new EmployeeT5());
    return "fifthDay/employeeT5/addEmployeeT5";
  }


  @PostMapping
  public String persist(@ModelAttribute EmployeeT5 employeeT5) {
    employeeT5Service.persist(employeeT5);
    return "redirect:/employeeT5";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("employeeT5", employeeT5Service.findById(id));
    model.addAttribute("task5s", task5Service.findAll());
    return "fifthDay/employeeT5/addEmployeeT5";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail", employeeT5Service.findById(id));
    return "fifthDay/employeeT5/employeeT5-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    employeeT5Service.deleteById(id);
    return "redirect:/employeeT5";
  }
}

