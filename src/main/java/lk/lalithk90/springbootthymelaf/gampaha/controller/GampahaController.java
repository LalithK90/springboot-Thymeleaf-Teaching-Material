package lk.lalithk90.springbootthymelaf.gampaha.controller;


import lk.lalithk90.springbootthymelaf.gampaha.entity.Gampaha;
import lk.lalithk90.springbootthymelaf.gampaha.service.GampahaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/gampaha")
public class GampahaController {
    private final GampahaService gampahaService;

    public GampahaController(GampahaService gampahaService) {
        this.gampahaService = gampahaService;
    }


    //1. findAll
    //2. findById
    //3. persist
    //4. delete
    //5. search
    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("gampahas", gampahaService.findAll());
        return "gampaha/gampaha";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable Integer id, Model model) {
        model.addAttribute("gampahaDetails", gampahaService.findById(id));
        return "gampaha/gampaha-detail";
    }

    @PostMapping("/save")
    public String persist(@ModelAttribute Gampaha gampaha, Model model) {
        System.out.println(" hhahha ");
        gampahaService.persist(gampaha);
        return "redirect:/gampaha/findAll";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id, Model model) {
        gampahaService.delete(id);
        return "redirect:/gampaha/findAll";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable Integer id, Model model) {
        model.addAttribute("gampaha", gampahaService.findById(id));
        return "gampaha/addGampaha";
    }

    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("gampaha", new Gampaha());
        return "gampaha/addGampaha";
    }
}
