package lk.lalithk90.springbootthymelaf;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Controller
@RequestMapping( "/hello" )
public class HelloWorldController {
    //access data from external rest API data get using following method
    @GetMapping( "/urlTest" )
    public String urlDataAccess(Model model) {
        final String uri = "https://jsonplaceholder.typicode.com/posts";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        String replace = result.replace("{", "<div>");
        String replace1 = replace.replace("}", "</div>");
        model.addAttribute("data", replace1);
        return "/urlTest.html";
    }

    List< Simple01 > simple01List = new ArrayList<>();
    List< Simple02 > simple02List = new ArrayList<>();
    private Random random = new Random();

    private List< Simple01 > createSample(int count) {
        Simple01 simple01 = new Simple01();
        Simple02 simple02 = new Simple02();
        for ( int i = 0; i < count; i++ ) {
            simple01.setName(createWord());
            simple01.setMobileNo(createMobileNumber());
            simple01.setAddress(createWord() + "\n" + createWord() + "\n" + createWord());

            for ( int j = 0; j < count; j++ ) {
                simple02.setId(UUID.randomUUID());
                simple02.setName(createWord() + createWord());
                simple02.setMobileNo(createMobileNumber());
                simple02List.add(simple02);
            }
            simple01.setSimple02s(simple02List);
            simple01List.add(simple01);

        }
        return simple01List;

    }

    private String createWord() {
        char[] word = new char[random.nextInt(8) + 3];
        // words of length 3 through 10. (1 and 2 letter words are boring.)
        for ( int j = 0; j < word.length; j++ ) {
            word[j] = (char) ('a' + random.nextInt(26));
        }
        return String.valueOf(word);

 /*       String[] randomStrings = new String[count];
        Random random = new Random();
        for ( int i = 0; i < count; i++ ) {
            char[] word = new char[random.nextInt(8) + 3];
            // words of length 3 through 10. (1 and 2 letter words are boring.)
            for ( int j = 0; j < word.length; j++ ) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }

        for ( String randomString : randomStrings ) {
            System.out.println(randomString);
        }*/
    }

    private String createMobileNumber() {
        String mobileNumber = "";
        for ( int j = 0; j < 10; j++ ) {
            mobileNumber += String.valueOf(random.nextInt(10));
        }
        return mobileNumber;
    }

    // 1st step (show html page)
    @GetMapping( "/step1" )
    public String step01() {
        System.out.println("I'm here");
        return "/hello.html";
    }

    // 2st step (how send data and catch from frontend)
    @GetMapping( "/step2" )
    public String step02(Model model) {
        System.out.println("how send data and catch to frontend");
        model.addAttribute("hello", "I'm come from Sri Lanka");
        return "/hello1.html";
    }

    // 3st step (how send from to fill data)
    @GetMapping( "/step3" )
    public String step03(Model model) {
        System.out.println("send object to frontend fill");
        model.addAttribute("simple", new Simple01());
        model.addAttribute("simpleList", simple01List);
        model.addAttribute("show", false);
        model.addAttribute("idShow", false);
        return "/hello3.html";
    }


    // 3st step (get data from frontend to backend)
    @PostMapping( "/step3" )
    public String step04(@ModelAttribute( "simple" ) Simple01 simple01) {
        System.out.println("come data from object");
//        to check what was come from frontend
//        System.out.println(simple01.toString());
        simple01List.add(simple01);
        simple01List.forEach(System.out::println);

/*        for ( Simple01 simple011 : simple01List ) {
            System.out.println(simple011);
        }
        for ( int i = 0; i < simple01List.size(); i++ ) {
            System.out.println(simple01List.get(i));
        }*/
        return "redirect:/hello/step3";
    }

    //step4 give on object details to view
    @GetMapping( "/{id}" )
    public String getDetails(@PathVariable( "id" ) int id, Model model) {
        model.addAttribute("data", simple01List.get(id));
        model.addAttribute("show", true);
        return "/hello3.html";
    }

    //step5 give on object details to edit
    @GetMapping( "/edit/{id}" )
    public String editDetails(@PathVariable( "id" ) int id, Model model) {
        model.addAttribute("simple", simple01List.get(id));
        model.addAttribute("show", false);
        model.addAttribute("idShow", true);
        return "/hello3.html";
    }

    //step5 give on object details to edit
    @GetMapping( "/remove/{id}" )
    public String deleteDetails(@PathVariable( "id" ) int id) {
        simple01List.remove(id);
        System.out.println("delete from list");
        simple01List.forEach(System.out::println);
        return "redirect:/hello/step3";
    }


    //display list in list
    @GetMapping( "/show/list" )
    public String showList(Model model) {
        model.addAttribute("sampleList", createSample(2));
        return "/listShow.html";
    }
    //drop-down list
    //combo box
    //radio button
    //check box
    //multiple check box


}


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Simple01 {

    private UUID id = UUID.randomUUID();
    private String name;
    private String mobileNo;
    private String address;

    private List< Simple02 > simple02s;

}

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Simple02 {

    private UUID id;
    private String name;
    private String mobileNo;

}