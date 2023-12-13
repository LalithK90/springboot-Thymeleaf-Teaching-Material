package cyou.lositha.springehcacheexample.formAttribute.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cyou.lositha.springehcacheexample.exampleResourceClass.OneValue;
import cyou.lositha.springehcacheexample.exampleResourceClass.Simple;
import cyou.lositha.springehcacheexample.exampleResourceClass.Something;
import cyou.lositha.springehcacheexample.formAttribute.entity.DropDown;
import cyou.lositha.springehcacheexample.formAttribute.entity.Form;
import cyou.lositha.springehcacheexample.formAttribute.entity.MultiValueCheckBox;
import cyou.lositha.springehcacheexample.formAttribute.entity.RadioButton;

@Controller
public class FormAttributeController {

    @GetMapping("/form")
    public String sendForm(Model model) {
        // One method to array create
        List<DropDown> dropDowns = Arrays.asList(new DropDown(1, "Male - Dropdown"),
                new DropDown(2, "Female - Dropdown"),
                new DropDown(3, "Other - Dropdown"));
        // second method to array create
        List<MultiValueCheckBox> multiValueCheckBoxes = new ArrayList<>();
        multiValueCheckBoxes.add(new MultiValueCheckBox(1, "Male - CheckBox"));
        multiValueCheckBoxes.add(new MultiValueCheckBox(2, "Female - CheckBox"));
        multiValueCheckBoxes.add(new MultiValueCheckBox(3, "Other - CheckBox"));
        // third method to array create
        List<RadioButton> radioButtons = new ArrayList<>();
        RadioButton one = new RadioButton(1, "Male - Radio");
        RadioButton two = new RadioButton(2, "Female - Radio");
        RadioButton third = new RadioButton(3, "Other - Radio");

        radioButtons.add(one);
        radioButtons.add(two);
        radioButtons.add(third);

        model.addAttribute("dropDowns", dropDowns);
        model.addAttribute("multiValueCheckBoxes", multiValueCheckBoxes);
        model.addAttribute("radioButtons", radioButtons);
        model.addAttribute("form", new Form());
        return "form/form";
    }

    @GetMapping("/formAttribute")
    public String formAttribute(Model model) {
        // radio
        model.addAttribute("something", new Something());
        model.addAttribute("simples", Simple.values());

        model.addAttribute("oneValue", OneValue.values());
        /*
         * model.addAttribute("singleCheckboxField", simple03s);
         * model.addAttribute("multiCheckboxAllValues", simple03s);
         */

        return "fromAttribute";
    }

}
