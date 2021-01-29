package lk.lalithk90.springboot_thymelaf.employeeCrud.controller;

import lk.lalithk90.springboot_thymelaf.employeeCrud.entity.Gender;
import lk.lalithk90.springboot_thymelaf.employeeCrud.entity.Pager;
import lk.lalithk90.springboot_thymelaf.employeeCrud.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping("/gender")
public class GenderController {

    private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;
    //1. service class inject.
    //2. findAll method create.
    //3. addForm method create.
    //4. persist method create.
    //5. edit method create.
    //6. delete method create.
    //7. view details.
    private final GenderService genderService; //1. done

    @Autowired
    public GenderController(GenderService genderService) {
        this.genderService = genderService;
    }

    @GetMapping
    public String findAll(Model model) { //2. done
        model.addAttribute("genders", genderService.findAll());
        return "employee/gender/gender";
    }

    @GetMapping("/newGender")
    public String addFrom(Model model) { //3.done
        model.addAttribute("gender", new Gender());
        model.addAttribute("addStatus", false);
        return "employee/gender/addGender";
    }

    @PostMapping(value = {"/save", "/update"})
    public String persist(@Valid @ModelAttribute Gender gender, BindingResult result, Model model) {
        //4.done
        if (result.hasErrors()) {
            model.addAttribute("addStatus", false);
            model.addAttribute("gender", gender);
            return "employee/gender/addGender";
        }
        System.out.println("Employee " + gender.toString());
        genderService.persist(gender);
        return "redirect:/gender";
    }

    @GetMapping("/edit/{id}")
    public String editGender(@PathVariable int id, Model model) {
        //5.done
        model.addAttribute("addStatus", true);
        model.addAttribute("gender", genderService.findById(id));
        return "employee/gender/addGender";
    }

    @GetMapping("/delete/{id}")
    public String deleteGender(@PathVariable int id) {
        //6.done
        genderService.delete(id);
        return "redirect:/gender";
    }

    @GetMapping("/{id}")
    public String viewGender(@PathVariable int id, Model model) {
        //6.done
        model.addAttribute("gender", genderService.findById(id));
        return "employee/gender/gender-detail";
    }

    @GetMapping("/gender")
    public ModelAndView showPersonsPage(@RequestParam("pageSize") Optional<Integer> pageSize,
                                        @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("employee/gender/genderNew");
        ArrayList<Integer> PAGE_SIZES = new ArrayList<Integer>();
        // Evaluate page size. If requested parameter is null, return initial
        // page size
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;

        Page<Gender> persons = genderService.findAllPageable(PageRequest.of(evalPage, evalPageSize));

        for (int i = 1; i <= 4; i++) {
            if (i <= 3) {
                PAGE_SIZES.add(INITIAL_PAGE_SIZE * i);
            }else {
                PAGE_SIZES.add((int) persons.getTotalElements());
            }
        }
        System.out.println("all pages " + persons.getTotalElements());
        Pager pager = new Pager(persons.getTotalPages(), persons.getNumber(), BUTTONS_TO_SHOW);

        modelAndView.addObject("persons", persons);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }
}
