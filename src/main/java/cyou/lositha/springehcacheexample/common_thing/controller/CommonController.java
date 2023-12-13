package cyou.lositha.springehcacheexample.common_thing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cyou.lositha.springehcacheexample.url_related.AnnotationService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CommonController {

    private final AnnotationService annotationService;

    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("urls", annotationService.getGetMappingUrls());
        return "index";
    }

}
