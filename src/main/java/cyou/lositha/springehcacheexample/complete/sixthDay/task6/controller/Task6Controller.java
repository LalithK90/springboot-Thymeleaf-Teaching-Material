package cyou.lositha.springehcacheexample.complete.sixthDay.task6.controller;

import cyou.lositha.springehcacheexample.common_thing.enums.Behavior;
import cyou.lositha.springehcacheexample.complete.sixthDay.task6.entity.Task6;
import cyou.lositha.springehcacheexample.complete.sixthDay.task6.service.Task6Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task6")
public class Task6Controller {

  private final Task6Service task6Service;

  public Task6Controller(Task6Service task6Service) {
    this.task6Service = task6Service;
  }

  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("tasks", task6Service.findAll());

    return "sixthDay/task6/task6";
  }

  @GetMapping("/add")
  private String addForm(Model model) {
    model.addAttribute("task6", new Task6());
    model.addAttribute("behaviours", Behavior.values());
    return "sixthDay/task6/addTask6";
  }

  @PostMapping
  public String persist(@ModelAttribute Task6 task6) {
    task6Service.persist(task6);
    return "redirect:/task6";
  }

  @GetMapping("/edit/{id}")
  private String edit(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("task6", task6Service.findById(id));
    model.addAttribute("behaviours", Behavior.values());
    return "sixthDay/task6/addTask6";
  }

  @GetMapping("/view/{id}")
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("taskDetail", task6Service.findById(id));
    return "sixthDay/task6/task6-detail";
  }

  @GetMapping("/delete/{id}")
  private String delete(@PathVariable("id") Integer id) {
    task6Service.deleteById(id);
    return "redirect:/task6";
  }
}
