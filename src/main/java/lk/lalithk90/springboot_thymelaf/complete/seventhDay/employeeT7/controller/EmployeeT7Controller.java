package lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.controller;


import lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.entity.EmployeeT7;
import lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.service.EmployeeT7Service;
import lk.lalithk90.springboot_thymelaf.complete.seventhDay.task7.service.Task7Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/employeeT7" )
public class EmployeeT7Controller {

  private final EmployeeT7Service employeeT7Service;
  private final Task7Service task7Service;

  public EmployeeT7Controller(EmployeeT7Service employeeT7Service, Task7Service task7Service) {
    this.employeeT7Service = employeeT7Service;
    this.task7Service = task7Service;
  }


  @GetMapping
  private String findAll(Model model) {
    model.addAttribute("employeeOnes", employeeT7Service.findAll());
    return "seventhDay/employeeT7/employeeT7";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
    model.addAttribute("task5s", task7Service.findAll());
     model.addAttribute("employeeT7",new EmployeeT7());
    return "seventhDay/employeeT7/addEmployeeT7";
  }


  @PostMapping
  public String persist(@ModelAttribute EmployeeT7 employeeT7) {
    employeeT7Service.persist(employeeT7);
    return "redirect:/employeeT7";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("employeeT7", employeeT7Service.findById(id));
    model.addAttribute("task5s", task7Service.findAll());
    return "seventhDay/employeeT7/addEmployeeT7";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail", employeeT7Service.findById(id));
    return "seventhDay/employeeT7/employeeT7-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    employeeT7Service.deleteById(id);
    return "redirect:/employeeT7";
  }
}

