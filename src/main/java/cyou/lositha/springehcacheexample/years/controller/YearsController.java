package cyou.lositha.springehcacheexample.years.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cyou.lositha.springehcacheexample.DateTimeAgeService;
import cyou.lositha.springehcacheexample.years.entity.Years;
import cyou.lositha.springehcacheexample.years.service.YearsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/years")
public class YearsController {
    private final YearsService yearsService;
    private final DateTimeAgeService dateTimeAgeService;

    @GetMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        yearsService.delete(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Years>> findAll() {
        var startAt = dateTimeAgeService.getCurrentTime();
        System.out.println("service come at ");
        var list = yearsService.findAll();
        System.out.println("list size : " + list.size());
        var endAt = dateTimeAgeService.getCurrentTime();
        System.out.println("Time deference. : " + dateTimeAgeService.getTimeDifference(startAt, endAt));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public ResponseEntity<Years> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(yearsService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/persist")
    @ResponseBody
    public ResponseEntity<Years> persist(@Valid @RequestBody Years years, BindingResult bindingResult) {
        return new ResponseEntity<>(yearsService.persist(years), HttpStatus.OK);
    }

    private String commonThings(Model model, Years years, Boolean addState) {
        model.addAttribute("years", years);
        model.addAttribute("addStatus", addState);
        model.addAttribute("view_name", "Add Or Update ");
        return "years/addYears";
    }

    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("yearses", yearsService.findAll());
        model.addAttribute("view_name", "All Years");
        return "years/years";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        return commonThings(model, new Years(), true);
    }

    @PostMapping(value = { "/add", "/update" })
    public String persist(@Valid @ModelAttribute Years years, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return commonThings(model, years, true);
        }
        yearsService.persist(years);
        return "redirect:/years/findAll";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        return commonThings(model, yearsService.findById(id), false);
    }

    @GetMapping("/remove/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        yearsService.delete(id);
        return "redirect:/years/findAll";
    }

    @GetMapping("/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        model.addAttribute("view_name", "Details About Years");
        model.addAttribute("yearsDetail", yearsService.findById(id));
        return "years/years_detail";
    }

}