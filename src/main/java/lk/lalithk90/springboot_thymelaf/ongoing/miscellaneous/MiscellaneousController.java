package lk.lalithk90.springboot_thymelaf.ongoing.miscellaneous;


import com.example_spring.complete.thirdDay.entity.EmployeeOne;
import com.example_spring.complete.thirdDay.service.EmployeeOneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping( "/miscellaneous" )
public class MiscellaneousController {
  // redirect attribute explanation
  private final EmployeeOneService employeeOneService;

  public MiscellaneousController(EmployeeOneService employeeOneService) {
    this.employeeOneService = employeeOneService;
  }

  @GetMapping
  private String findAll(Model model) {
    model.addAttribute("employeeOnes", employeeOneService.findAll());
    return "miscellaneous/employeeOne";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
    model.addAttribute("employeeOne", new EmployeeOne());
    return "miscellaneous/addEmployeeOne";
  }

  @PostMapping
  public String persist(@ModelAttribute EmployeeOne employeeOne, RedirectAttributes redirectAttributes) {
    redirectAttributes.addFlashAttribute("employeeDetail", employeeOneService.persist(employeeOne));
    return "redirect:/miscellaneous";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("employeeOne", employeeOneService.findById(id));
    return "miscellaneous/addEmployeeOne";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("employeeDetail", employeeOneService.findById(id));
    return "miscellaneous/employeeOne-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable( "id" ) Integer id) {
    employeeOneService.deleteById(id);
    return "redirect:/miscellaneous";
  }
  // fragment examples show methods

  @GetMapping( "/fragment" )
  private String fragment() {
    return "fragments/sample-content";
  }

  @GetMapping( "/fragmentExample" )
  private String fragmentExample() {
    return "miscellaneous/fragment-example";
  }

}
