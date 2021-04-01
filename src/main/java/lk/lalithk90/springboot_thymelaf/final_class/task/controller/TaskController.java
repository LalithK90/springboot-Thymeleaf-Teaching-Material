package lk.lalithk90.springboot_thymelaf.final_class.task.controller;


import lk.lalithk90.springboot_thymelaf.final_class.task.entity.Task;
import lk.lalithk90.springboot_thymelaf.final_class.task.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/task" )
public class TaskController {
  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  // 1. all Task
  @GetMapping
  public String findAllTask(Model model) {
    model.addAttribute("tasks", taskService.findAll());
    return "task/task";
  }

  // 2. from

  @GetMapping( "/add" )
  public String addFrom(Model model) {
    return common(model, new Task(), false);
  }

  // 3. save/update
  @PostMapping( "/save" )
  public String persist(@ModelAttribute Task task) {
    taskService.persit(task);
    return "redirect:/task";
  }

  private String common(Model model, Task task, boolean addStatus) {
    model.addAttribute("task", task);
    model.addAttribute("addStatus", addStatus);
    return "task/addTask";
  }

  // 4. edit
  @GetMapping( "/edit/{id}" )
  public String editTask(@PathVariable( "id" ) Integer id, Model model) {
    return common(model, taskService.findById(id), true);
  }

  // 5. delete
  @GetMapping( "/delete/{id}" )
  public String deleteTask(@PathVariable( "id" ) Integer id) {
    taskService.delete(id);
    return "redirect:/task";
  }

  // 6. views
  @GetMapping( "/view/{id}" )
  public String viewTask(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("taskDetail", taskService.findById(id));
    return "task/task-detail";
  }
}
