package lk.lalithk90.springbootthymelaf.kokis.controller;

import lk.lalithk90.springbootthymelaf.kokis.entity.Mixture;
import lk.lalithk90.springbootthymelaf.kokis.service.MixtureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MixtureController {
    private final MixtureService mixtureService;

    public MixtureController(MixtureService mixtureService) {
        this.mixtureService = mixtureService;
    }

    @GetMapping("/kokis")
    public String form(Model model) {
        model.addAttribute("addStatus", false);
        model.addAttribute("mixture", new Mixture());
        return "kokis/addMixture";
    }

    @PostMapping("/kokis")
    public String save(@Valid @ModelAttribute Mixture mixture, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("mixture", mixture);
            System.out.println("im error");
            return "kokis/addMixture";
        }
        mixtureService.persist(mixture);
        return "redirect:/kokis/all";

    }

    //create
    //update ->edit
    // delete
    // read
    @GetMapping("/kokis/{id}")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("addStatus", true);
        model.addAttribute("mixture", mixtureService.findById(id));
        return "kokis/addMixture";

    }
    @GetMapping("/kokis/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("mixture", mixtureService.findById(id));
        return "kokis/mixture-detail";

    }
    @GetMapping("/kokis/delete/{id}")
    public String delete(@PathVariable int id) {
        mixtureService.delete(id);
        return "redirect:/kokis/all";

    }
//find all
    @GetMapping("/kokis/all")
    public String findAll(Model model){
        model.addAttribute("mixtures",mixtureService.findAll());
        return "kokis/mixture";
    }

}
