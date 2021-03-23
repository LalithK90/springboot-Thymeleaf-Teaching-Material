package lk.lalithk90.springboot_thymelaf.complete.thirdDay.controller;


import lk.lalithk90.springboot_thymelaf.complete.thirdDay.entity.EmployeeOne;
import lk.lalithk90.springboot_thymelaf.complete.thirdDay.service.EmployeeOneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/employeeOne" )
public class EmployeeOneController {
  //CRUD -> Create Read Update Delete
  private final EmployeeOneService employeeOneService;

  public EmployeeOneController(EmployeeOneService employeeOneService) {
    this.employeeOneService = employeeOneService;
  }

  // 1. All entity values method => Read
  @GetMapping //Method = get =>  localhost:8080/employeeOne
  private String findAll(Model model) {

    model.addAttribute("employeeOnes", employeeOneService.findAll());

    return "thirdDay/employeeOne";
  }

  // 2. One entity add form method => not related crud
  @GetMapping( "/add" ) //Method = get => localhost:8080/employeeOne/add
  private String addForm(Model model) {
     model.addAttribute("employeeOne",new EmployeeOne());
    return "thirdDay/addEmployeeOne";
  }

  // 3. save/update (persist) method => create and update
  @PostMapping //Method = post => localhost:8080/employeeOne
  public String persist(@ModelAttribute EmployeeOne employeeOne) {

    employeeOneService.persist(employeeOne);
    return "redirect:/employeeOne";
  }

  // 4. particular entity edit => read
  @GetMapping( "/edit/{id}" ) //Method = get =>  localhost:8080/employeeOne/edit/id
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("employeeOne",employeeOneService.findById(id));
    return "thirdDay/addEmployeeOne";
  }
  // 4. particular entity view => read
  @GetMapping( "/view/{id}" ) //Method = get =>  localhost:8080/employeeOne/view/id
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("employeeDetail",employeeOneService.findById(id));
    return "thirdDay/employeeOne-detail";
  }
  // 5. particular entity delete => delete
  @GetMapping( "/delete/{id}" ) //Method = get =>  localhost:8080/employeeOne/delete/id
  private String delete(@PathVariable("id") Integer id) {
    employeeOneService.deleteById(id);
    return "redirect:/employeeOne";
  }
}
// project git link : https://github.com/Lositha/sample_spring_project_one.git


// 1. entity
// 2. dao
// 3. service
// 4. controller
// 5. html file
  // 5.1 all data view
  // 5.2 add form
  // 5.3 data view



//todo todo -> app
