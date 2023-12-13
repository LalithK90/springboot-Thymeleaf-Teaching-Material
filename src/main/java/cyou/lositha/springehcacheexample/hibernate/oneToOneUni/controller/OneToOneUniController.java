package cyou.lositha.springehcacheexample.hibernate.oneToOneUni.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cyou.lositha.springehcacheexample.hibernate.oneToOneUni.entity.InstructorDetailOneToOneUni;
import cyou.lositha.springehcacheexample.hibernate.oneToOneUni.entity.InstructorOneToOneUni;
import cyou.lositha.springehcacheexample.hibernate.oneToOneUni.service.InstructorOneToOneUniService;

@RestController
public class OneToOneUniController {
    private final InstructorOneToOneUniService instructorOneToOneUniService;

    public OneToOneUniController(InstructorOneToOneUniService instructorOneToOneUniService) {
        this.instructorOneToOneUniService = instructorOneToOneUniService;
    }

    @GetMapping("/oneToOneUni")
    public void oneToOneUniDemo() {
        oneToOneUniCreate();
        System.out.println("Created list...........\n Show Saved item");
        instructorOneToOneUniService.findAll().forEach(x -> System.out.println(x.toString()));
        oneToOneUniDelete();
        System.out.println("After delete one");
        instructorOneToOneUniService.findAll().forEach(x -> System.out.println(x.toString()));

    }

    public void oneToOneUniCreate() {
        // create the objects
        InstructorOneToOneUni tempInstructor = new InstructorOneToOneUni("Asanka", "Lalith", "as@gmail.com");

        InstructorDetailOneToOneUni tempInstructorDetail = new InstructorDetailOneToOneUni(
                "http://www.example.com/youtube",
                "Cricket");

        InstructorOneToOneUni tempInstructor1 = new InstructorOneToOneUni("Nuwan ", "Bandara", "nuwan@gamil.com");

        InstructorDetailOneToOneUni tempInstructorDetail1 = new InstructorDetailOneToOneUni(
                "http://www.example.com/youtube",
                "Guitar");

        // associate the objects
        tempInstructor.setInstructorDetailOneToOneUni(tempInstructorDetail);
        tempInstructor1.setInstructorDetailOneToOneUni(tempInstructorDetail1);

        // save the instructor
        //
        // Note: this will ALSO save the details object
        // because of CascadeType.ALL
        //
        System.out.println("Saving instructor: ");
        System.out.println(instructorOneToOneUniService.persist(tempInstructor).toString());
        System.out.println(instructorOneToOneUniService.persist(tempInstructor1).toString());

        System.out.println("Done!");

    }

    public void oneToOneUniDelete() {

        // get instructor by primary key / id
        int index = instructorOneToOneUniService.findAll().size() - 1;
        InstructorOneToOneUni tempInstructor = instructorOneToOneUniService.findById(
                instructorOneToOneUniService.findAll().get(index).getId());

        System.out.println("Found instructor: " + tempInstructor.toString());

        // delete the instructors

        System.out.println("Deleting: " + tempInstructor.toString());

        // Note: will ALSO delete associated "details" object
        // because of CascadeType.ALL
        //
        instructorOneToOneUniService.delete(tempInstructor.getId());
    }
}
