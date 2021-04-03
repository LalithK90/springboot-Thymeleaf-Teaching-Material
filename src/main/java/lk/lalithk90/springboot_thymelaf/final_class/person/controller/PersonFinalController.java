package lk.lalithk90.springboot_thymelaf.final_class.person.controller;

import lk.lalithk90.springboot_thymelaf.final_class.person.entity.PersonFinal;
import lk.lalithk90.springboot_thymelaf.final_class.person.service.PersonFinalService;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonFinalTask;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.enums.PersonTaskStatus;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.service.PersonTaskService;
import lk.lalithk90.springboot_thymelaf.final_class.task.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping( "/person" )
public class PersonFinalController {
  private final PersonFinalService personFinalService;
  private final TaskService taskService;
  private final PersonTaskService personTaskService;

  public PersonFinalController(PersonFinalService personFinalService, TaskService taskService,
                               PersonTaskService personTaskService) {
    this.personFinalService = personFinalService;
    this.taskService = taskService;
    this.personTaskService = personTaskService;
  }


  // 1. all PersonFinal
  @GetMapping
  public String findAllPerson(Model model) {
    model.addAttribute("persons", personFinalService.findAll());
    return "person/person";
  }

  // 2. from

  @GetMapping( "/add" )
  public String addFrom(Model model) {
    return common(model, new PersonFinal(), false);
  }

  // 3. save/update
  @PostMapping( "/save" )
  public String persist(@ModelAttribute PersonFinal personFinal) {
    List< PersonFinalTask > personFinalTaskList = new ArrayList<>();

    for ( PersonFinalTask personFinalTask : personFinal.getPersonFinalTasks() ) {
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
  @GetMapping( "/edit/{id}" )
  public String editPerson(@PathVariable( "id" ) Integer id, Model model) {
    return common(model, personFinalService.findById(id), true);
  }

  // 5. delete
  @GetMapping( "/delete/{id}" )
  public String deletePerson(@PathVariable( "id" ) Integer id) {
    personFinalService.delete(id);
    return "redirect:/person";
  }

  // 6. views
  @GetMapping( "/view/{id}" )
  public String viewPerson(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("personDetail", personFinalService.findById(id));
    return "person/person-detail";
  }
}
