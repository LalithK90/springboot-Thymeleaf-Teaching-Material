package lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.controller;


import lk.lalithk90.springboot_thymelaf.common_thing.enums.Behavior;
import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.entity.Task;
import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.service.Task4Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/task" )
public class Task4Controller {

  private final Task4Service task4Service;

  public Task4Controller(Task4Service task4Service) {
    this.task4Service = task4Service;
  }


  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("tasks", task4Service.findAll());

    return "fourthDay/task/task";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
     model.addAttribute("task",new Task());
     model.addAttribute("behaviours", Behavior.values());
    return "fourthDay/task/addTask";
  }


  @PostMapping
  public String persist(@ModelAttribute Task task) {
    task4Service.persist(task);
    return "redirect:/task";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("task", task4Service.findById(id));
    model.addAttribute("behaviours", Behavior.values());
    return "fourthDay/task/addTask";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("taskDetail", task4Service.findById(id));
    return "fourthDay/task/task-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    task4Service.deleteById(id);
    return "redirect:/task";
  }
}

