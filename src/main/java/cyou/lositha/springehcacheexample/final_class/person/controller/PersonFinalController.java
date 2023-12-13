package cyou.lositha.springehcacheexample.final_class.person.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cyou.lositha.springehcacheexample.final_class.person.entity.PersonFinal;
import cyou.lositha.springehcacheexample.final_class.person.service.PersonFinalService;
import cyou.lositha.springehcacheexample.final_class.person_task.entity.PersonFinalTask;
import cyou.lositha.springehcacheexample.final_class.person_task.entity.enums.PersonTaskStatus;
import cyou.lositha.springehcacheexample.final_class.person_task.service.PersonTaskService;
import cyou.lositha.springehcacheexample.final_class.task.service.TaskService;

@Controller
@RequestMapping("/person")
public class PersonFinalController {
  private final PersonFinalService personFinalService;
  private final TaskService taskService;

  public PersonFinalController(PersonFinalService personFinalService, TaskService taskService,
      PersonTaskService personTaskService) {
    this.personFinalService = personFinalService;
    this.taskService = taskService;
  }

  // 1. all PersonFinal
  @GetMapping
  public String findAllPerson(Model model) {
    model.addAttribute("persons", personFinalService.findAll());
    return "person/person";
  }

  // 2. from

  @GetMapping("/add")
  public String addFrom(Model model) {
    return common(model, new PersonFinal(), false);
  }

  // 3. save/update
  @PostMapping("/save")
  public String persist(@ModelAttribute PersonFinal personFinal) {
    List<PersonFinalTask> personFinalTaskList = new ArrayList<>();

    for (PersonFinalTask personFinalTask : personFinal.getPersonFinalTasks()) {
      personFinalTask.setPersonFinal(personFinal);
      personFinalTaskList.add(personFinalTask);
    }
    personFinal.setPersonFinalTasks(personFinalTaskList);
    personFinalService.persist(personFinal);
    return "redirect:/person";
  }

  private String common(Model model, PersonFinal personFinal, boolean addStatus) {
    model.addAttribute("person", personFinal);
    model.addAttribute("tasks", taskService.findAll());
    model.addAttribute("addStatus", addStatus);
    model.addAttribute("personTaskStatuses", PersonTaskStatus.values());
    return "personFinal/addPerson";
  }

  // 4. edit
  @GetMapping("/edit/{id}")
  public String editPerson(@PathVariable("id") Integer id, Model model) {
    return common(model, personFinalService.findById(id), true);
  }

  // 5. delete
  @GetMapping("/delete/{id}")
  public String deletePerson(@PathVariable("id") Integer id) {
    personFinalService.delete(id);
    return "redirect:/person";
  }

  // 6. views
  @GetMapping("/view/{id}")
  public String viewPerson(@PathVariable("id") Integer id, Model model) {
    model.addAttribute("personDetail", personFinalService.findById(id));
    return "person/person-detail";
  }
}
