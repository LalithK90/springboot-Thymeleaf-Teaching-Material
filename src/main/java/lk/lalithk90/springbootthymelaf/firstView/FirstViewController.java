package lk.lalithk90.springbootthymelaf.firstView;

import lk.lalithk90.springbootthymelaf.firstView.entityClass.FirstInput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstViewController {
    //first page view
    @GetMapping( "/firstPageView" )
    public String firstPageView() {
        return "firstView/firstPageView";
    }

    //first parameter send to view
    @GetMapping( "/firstParameterSendView" )
    public String firstParameterSendView(Model model) {
        model.addAttribute("firstParameter", "Hey \n I am first Parameter");
        return "firstView/firstParameterView";
    }
    // input list
    List< FirstInput > firstInputs = new ArrayList<>();
    //input enter page show
    @GetMapping( "/firstInput" )
    public String firstInputEnterPage(Model model) {
        model.addAttribute("messageStatus", false);
        model.addAttribute("inputs", firstInputs);
          return "firstView/firstInput";
    }

    // entered input send to firstInputs array and recall to input enter page show
    @PostMapping( "/firstInput" )
    public String firstInput(@ModelAttribute FirstInput firstInput, Model model) {
        firstInputs.add(firstInput);
        model.addAttribute("messageStatus", true);
        model.addAttribute("message", "Successfully add Your entered name to list...");
        return "redirect:/firstInput";
    }
//enter data list send to font end
    @GetMapping("/enteredInputs")
    public String enteredInputsViewPage(Model model) {
        model.addAttribute("inputs", firstInputs);
        return "firstView/enteredInputsPage";
    }
}
