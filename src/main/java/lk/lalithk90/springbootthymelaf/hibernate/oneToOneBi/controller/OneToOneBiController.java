package lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.controller;

import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.entity.InstructorDetailOneToOneBi;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.entity.InstructorOneToOneBi;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.service.InstructorOneToOneBiService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.entity.InstructorDetailOneToOneUni;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.entity.InstructorOneToOneUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToOneBiController {
    private final InstructorOneToOneBiService instructorOneToOneBiService;

    @Autowired
    public OneToOneBiController(InstructorOneToOneBiService instructorOneToOneBiService) {
        this.instructorOneToOneBiService = instructorOneToOneBiService;
    }


    @GetMapping( "/oneToOneUniDemo" )
    public void oneToOneUniDemo() {
        oneToOneUniCreate();
        System.out.println("Created list...........\n Show Saved item");
        instructorOneToOneBiService.findAll().forEach(x -> System.out.println(x.toString()));
        oneToOneUniDelete();
        System.out.println("After delete one");
        instructorOneToOneBiService.findAll().forEach(x -> System.out.println(x.toString()));

    }

    public void oneToOneUniCreate() {
        // create the objects
        InstructorOneToOneBi tempInstructor =
                new InstructorOneToOneBi("Asanka", "Lalith", "as@gmail.com");

        InstructorDetailOneToOneBi tempInstructorDetail =
                new InstructorDetailOneToOneBi(
                        "http://www.example.com/youtube",
                        "Cricket");

        InstructorOneToOneBi tempInstructor1 =
                new InstructorOneToOneBi("Nuwan ", "Bandara", "nuwan@gamil.com");

        InstructorDetailOneToOneBi tempInstructorDetail1 =
                new InstructorDetailOneToOneBi(
                        "http://www.example.com/youtube",
                        "Guitar");

        // associate the objects
        tempInstructor.setInstructorDetailOneToOneBi(tempInstructorDetail);
        tempInstructor1.setInstructorDetailOneToOneBi(tempInstructorDetail1);


        // save the instructor
        //
        // Note: this will ALSO save the details object
        // because of CascadeType.ALL
        //
        System.out.println("Saving instructor: ");
        System.out.println(instructorOneToOneBiService.persist(tempInstructor).toString());
        System.out.println(instructorOneToOneBiService.persist(tempInstructor1).toString());


        System.out.println("Done!");

    }

    public void oneToOneUniDelete() {


        // get instructor by primary key / id
        int index = instructorOneToOneBiService.findAll().size() - 1;
        InstructorOneToOneBi tempInstructor = instructorOneToOneBiService.findById(
                instructorOneToOneBiService.findAll().get(index).getId());

        System.out.println("Found instructor: " + tempInstructor.toString());

        // delete the instructors

        System.out.println("Deleting: " + tempInstructor.toString());

        // Note: will ALSO delete associated "details" object
        // because of CascadeType.ALL
        //
        instructorOneToOneBiService.delete(tempInstructor.getId());
    }
}
