package lk.lalithk90.springboot_thymelaf.final_class.viva_date;

import lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums.LiveDead;
import lk.lalithk90.springboot_thymelaf.final_class.person.entity.Person;
import lk.lalithk90.springboot_thymelaf.final_class.person.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/viva" )
public class VivaController {
  private final PersonService personService;

  public VivaController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping
  public String stopAll(Model model) {
    model.addAttribute("activeStatus", true);
    model.addAttribute("persons", personService.findAllStop());
    return "person/person";
  }

  @GetMapping( "/active/{id}" )
  public String activePerson(@PathVariable( "id" ) Integer id) {
    Person personDB = personService.findById(id);
    personDB.setLiveDead(LiveDead.ACTIVE);
    personService.persist(personDB);
    return "redirect:/person";
  }

  @GetMapping( "/edit/{id}" )
  public String activePersonLong(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("person", personService.findById(id));
    model.addAttribute("liveDeads", LiveDead.values());
    model.addAttribute("activeStatus", true);
    return "viva/addPerson";
  }
}
