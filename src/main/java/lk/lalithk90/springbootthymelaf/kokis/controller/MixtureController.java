package lk.lalithk90.springbootthymelaf.kokis.controller;

import lk.lalithk90.springbootthymelaf.kokis.entity.Mixture;
import lk.lalithk90.springbootthymelaf.kokis.service.MixtureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MixtureController {
    private final MixtureService mixtureService;

    public MixtureController(MixtureService mixtureService) {
        this.mixtureService = mixtureService;
    }

    @GetMapping("/kokis")
    public String form() {
        return "kokis/addMixture";
    }

    @PostMapping("/kokis")
    public String save(@Valid @ModelAttribute Mixture mixture) {
        mixtureService.create(mixture);
        return "kokis/addMixture";
    }
}
