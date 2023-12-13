package cyou.lositha.springehcacheexample.complete.fifthDay.task5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cyou.lositha.springehcacheexample.common_thing.enums.Behavior;
import cyou.lositha.springehcacheexample.complete.fifthDay.task5.entity.Task5;
import cyou.lositha.springehcacheexample.complete.fifthDay.task5.service.Task5Service;

@Controller
@RequestMapping("/task5")
public class Task5Controller {

  private final Task5Service task5Service;

  public Task5Controller(Task5Service task5Service) {
    this.task5Service = task5Service;
  }

  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("tasks", task5Service.findAll());

    return "fifthDay/task5/task5";
  }

  @GetMapping("/add")
  private String addForm(Model model) {
    model.addAttribute("task5", new Task5());
    model.addAttribute("behaviours", Behavior.values());
    return "fifthDay/task5/addTask5";
  }

  @PostMapping
  public String persist(@ModelAttribute Task5 task5) {
    task5Service.persist(task5);
    return "redirect:/task5";
  }

  @GetMapping("/edit/{id}")
  private String edit(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("task5", task5Service.findById(id));
    model.addAttribute("behaviours", Behavior.values());
    return "fifthDay/task5/addTask5";
  }

  @GetMapping("/view/{id}")
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("taskDetail", task5Service.findById(id));
    return "fifthDay/task5/task5-detail";
  }

  @GetMapping("/delete/{id}")
  private String delete(@PathVariable("id") Integer id) {
    task5Service.deleteById(id);
    return "redirect:/task5";
  }
}
