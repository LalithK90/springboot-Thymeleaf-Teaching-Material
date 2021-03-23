package lk.lalithk90.springboot_thymelaf.complete.seventhDay.task7.controller;


import lk.lalithk90.springboot_thymelaf.common_thing.enums.Behavior;
import lk.lalithk90.springboot_thymelaf.complete.seventhDay.task7.entity.Task7;
import lk.lalithk90.springboot_thymelaf.complete.seventhDay.task7.service.Task7Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/task7" )
public class Task7Controller {

  private final Task7Service task7Service;

  public Task7Controller(Task7Service task7Service) {
    this.task7Service = task7Service;
  }


  @GetMapping
  private String findAll(Model model) {

    model.addAttribute("tasks", task7Service.findAll());

    return "seventhDay/task7/task7";
  }

  @GetMapping( "/add" )
  private String addForm(Model model) {
     model.addAttribute("task7",new Task7());
     model.addAttribute("behaviours", Behavior.values());
    return "seventhDay/task7/addTask7";
  }


  @PostMapping
  public String persist(@ModelAttribute Task7 task7) {
    task7Service.persist(task7);
    return "redirect:/task7";
  }

  @GetMapping( "/edit/{id}" )
  private String edit(@PathVariable("id") Integer id, Model model) {
     model.addAttribute("task7", task7Service.findById(id));
    model.addAttribute("behaviours", Behavior.values());
    return "seventhDay/task7/addTask7";
  }

  @GetMapping( "/view/{id}" )
  private String view(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("taskDetail", task7Service.findById(id));
    return "seventhDay/task7/task7-detail";
  }

  @GetMapping( "/delete/{id}" )
  private String delete(@PathVariable("id") Integer id) {
    task7Service.deleteById(id);
    return "redirect:/task7";
  }
}

