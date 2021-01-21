package lk.lalithk90.springbootthymelaf.malik.controller;


import lk.lalithk90.springbootthymelaf.malik.entity.Malik;
import lk.lalithk90.springbootthymelaf.malik.service.MalikService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MalikController {
    private final MalikService malikService;

    public MalikController(MalikService malikService) {
        this.malikService = malikService;
    }

    //localhost:8080/malik
    @GetMapping("/malik")
    public String name() {
        System.out.println("hhhhhh");
        return "malik/malik";
    }

    @GetMapping("/malikOne")
    public String nameOne() {
        System.out.println("hhhhhh");
        return "malik/malik";
    }

    @GetMapping("/malikTwo")
    public String nameTwo(Model model) {
        model.addAttribute("name", "Malik");
        return "malik/malik";
    }

    //1. findAll
    //2. findById
    //3. persist
    //4. delete
    //5. search
    @GetMapping("/malik/findAll")
    public String findAll(Model model) {
        model.addAttribute("maliks", malikService.findAll());
        return "malik/malik";
    }

    @GetMapping("/malik/findById/{id}")
    public String findById(@PathVariable Integer id, Model model) {
        model.addAttribute("malikDetails", malikService.findById(id));
        return "malik/malik-detail";
    }

    @PostMapping("/malik/save")
    public String persist(@ModelAttribute Malik malik, Model model) {
        malikService.persist(malik);
        return "redirect:/malik/findAll";
    }

    @GetMapping("/malik/delete/{id}")
    public String deleteById(@PathVariable Integer id, Model model) {
        malikService.delete(id);
        return "redirect:/malik/findAll";
    }

    @GetMapping("/malik/update/{id}")
    public String updateForm(@PathVariable Integer id, Model model) {
        model.addAttribute("malik", malikService.findById(id));
        return "malik/addMalik";
    }

    @GetMapping("/malik/add")
    public String form(Model model) {
        model.addAttribute("malik", new Malik());
        return "malik/addMalik";
    }
}
