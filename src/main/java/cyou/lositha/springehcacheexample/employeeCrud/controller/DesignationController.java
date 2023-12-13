package cyou.lositha.springehcacheexample.employeeCrud.controller;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Designation;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Pager;
import cyou.lositha.springehcacheexample.employeeCrud.service.DesignationService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping("/designation")
public class DesignationController {

    private final DesignationService designationService; // 1. done

    public DesignationController(DesignationService designationService) {
        this.designationService = designationService;
    }

    @GetMapping
    public String findAll(Model model) { // 2. done
        model.addAttribute("designations", designationService.findAll());
        return "employee/designation/designation";
    }

    @GetMapping("/newGender")
    public String addFrom(Model model) { // 3.done
        model.addAttribute("designation", new Designation());
        model.addAttribute("addStatus", false);
        return "employee/designation/addDesignation";
    }

    @PostMapping(value = { "/save", "/update" })
    public String persist(@Valid @ModelAttribute Designation designation, BindingResult result, Model model) {
        // 4.done
        if (result.hasErrors()) {
            model.addAttribute("addStatus", false);
            model.addAttribute("designation", designation);
            return "employee/designation/addDesignation";
        }
        System.out.println("Employee " + designation.toString());
        designationService.persist(designation);
        return "redirect:/designation";
    }

    @GetMapping("/edit/{id}")
    public String editGender(@PathVariable Long id, Model model) {
        // 5.done
        model.addAttribute("addStatus", true);
        model.addAttribute("designation", designationService.findById(id));
        return "employee/designation/addDesignation";
    }

    @GetMapping("/delete/{id}")
    public String deleteGender(@PathVariable Long id) {
        // 6.done
        designationService.delete(id);
        return "redirect:/designation";
    }

    @GetMapping("/{id}")
    public String viewGender(@PathVariable Long id, Model model) {
        // 6.done
        model.addAttribute("designation", designationService.findById(id));
        return "employee/designation/designation-detail";
    }

}
