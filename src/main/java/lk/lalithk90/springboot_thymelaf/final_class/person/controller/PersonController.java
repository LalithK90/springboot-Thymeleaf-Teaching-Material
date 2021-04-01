package lk.lalithk90.springboot_thymelaf.final_class.person.controller;

import lk.lalithk90.springboot_thymelaf.final_class.person.entity.Person;
import lk.lalithk90.springboot_thymelaf.final_class.person.service.PersonService;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonTask;
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
public class PersonController {
  private final PersonService personService;
  private final TaskService taskService;
  private final PersonTaskService personTaskService;

  public PersonController(PersonService personService, TaskService taskService, PersonTaskService personTaskService) {
    this.personService = personService;
    this.taskService = taskService;
    this.personTaskService = personTaskService;
  }


  // 1. all Person
  @GetMapping
  public String findAllPerson(Model model) {
    model.addAttribute("persons", personService.findAll());
    return "person/person";
  }

  // 2. from

  @GetMapping( "/add" )
  public String addFrom(Model model) {
    return common(model, new Person(), false);
  }

  // 3. save/update
  @PostMapping( "/save" )
  public String persist(@ModelAttribute Person person) {
    List< PersonTask > personTaskList = new ArrayList<>();

    for ( PersonTask personTask : person.getPersonTasks() ) {
      personTask.setPerson(person);
      personTaskList.add(personTask);
    }
    person.setPersonTasks(personTaskList);
    personService.persist(person);
    return "redirect:/person";
  }

  private String common(Model model, Person person, boolean addStatus) {
    model.addAttribute("person", person);
    model.addAttribute("tasks", taskService.findAll());
    model.addAttribute("addStatus", addStatus);
    model.addAttribute("personTaskStatuses", PersonTaskStatus.values());
    return "person/addPerson";
  }

  // 4. edit
  @GetMapping( "/edit/{id}" )
  public String editPerson(@PathVariable( "id" ) Integer id, Model model) {
    return common(model, personService.findById(id), true);
  }

  // 5. delete
  @GetMapping( "/delete/{id}" )
  public String deletePerson(@PathVariable( "id" ) Integer id) {
    personService.delete(id);
    return "redirect:/person";
  }

  // 6. views
  @GetMapping( "/view/{id}" )
  public String viewPerson(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("personDetail", personService.findById(id));
    return "person/person-detail";
  }
}
