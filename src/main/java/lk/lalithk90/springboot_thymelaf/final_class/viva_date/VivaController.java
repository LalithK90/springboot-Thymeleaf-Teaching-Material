package lk.lalithk90.springboot_thymelaf.final_class.viva_date;

import lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums.LiveDead;
import lk.lalithk90.springboot_thymelaf.final_class.person.entity.PersonFinal;
import lk.lalithk90.springboot_thymelaf.final_class.person.service.PersonFinalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/viva" )
public class VivaController {
  private final PersonFinalService personFinalService;

  public VivaController(PersonFinalService personFinalService) {
    this.personFinalService = personFinalService;
  }

  @GetMapping
  public String stopAll(Model model) {
    model.addAttribute("activeStatus", true);
    model.addAttribute("persons", personFinalService.findAllStop());
    return "person/person";
  }

  @GetMapping( "/active/{id}" )
  public String activePerson(@PathVariable( "id" ) Integer id) {
    PersonFinal personFinalDB = personFinalService.findById(id);
    personFinalDB.setLiveDead(LiveDead.ACTIVE);
    personFinalService.persist(personFinalDB);
    return "redirect:/person";
  }

  @GetMapping( "/edit/{id}" )
  public String activePersonLong(@PathVariable( "id" ) Integer id, Model model) {
    model.addAttribute("person", personFinalService.findById(id));
    model.addAttribute("liveDeads", LiveDead.values());
    model.addAttribute("activeStatus", true);
    return "viva/addPerson";
  }
}
