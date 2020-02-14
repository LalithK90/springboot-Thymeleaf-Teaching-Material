package lk.lalithk90.springbootthymelaf.formAttribute;


import lk.lalithk90.springbootthymelaf.exampleResourceClass.OneValue;
import lk.lalithk90.springbootthymelaf.exampleResourceClass.Simple;
import lk.lalithk90.springbootthymelaf.exampleResourceClass.Something;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormAttributeController {
    //combo box
    //radio button
    //check box
    //multiple check box

    @GetMapping( "/fromAttribute" )
    public String fromAttribute(Model model) {
//radio
        model.addAttribute("something", new Something());
        model.addAttribute("simples", Simple.values());

        model.addAttribute("oneValue", OneValue.values());
 /*          model.addAttribute("singleCheckboxField", simple03s);
        model.addAttribute("multiCheckboxAllValues", simple03s);*/

        return "fromAttribute";
    }

}
