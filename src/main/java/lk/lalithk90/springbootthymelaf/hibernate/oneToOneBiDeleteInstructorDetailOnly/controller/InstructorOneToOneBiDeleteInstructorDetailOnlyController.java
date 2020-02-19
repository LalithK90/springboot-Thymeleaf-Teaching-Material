package lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.controller;

import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorDetailOneToOneBiDeleteInstructorDetailOnly;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorOneToOneBiDeleteInstructorDetailOnly;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.service.InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.service.InstructorOneToOneBiDeleteInstructorDetailOnlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorOneToOneBiDeleteInstructorDetailOnlyController {
    private final InstructorOneToOneBiDeleteInstructorDetailOnlyService instructorOneToOneBiDeleteInstructorDetailOnlyService;
    private final InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService instructorDetailOneToOneBiDeleteInstructorDetailOnlyService;

    @Autowired
    public InstructorOneToOneBiDeleteInstructorDetailOnlyController(InstructorOneToOneBiDeleteInstructorDetailOnlyService instructorOneToOneBiDeleteInstructorDetailOnlyService, InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService instructorDetailOneToOneBiDeleteInstructorDetailOnlyService) {
        this.instructorOneToOneBiDeleteInstructorDetailOnlyService =
                instructorOneToOneBiDeleteInstructorDetailOnlyService;
        this.instructorDetailOneToOneBiDeleteInstructorDetailOnlyService =
                instructorDetailOneToOneBiDeleteInstructorDetailOnlyService;
    }

    @GetMapping( "/instructorOneToOneBiDeleteInstructorDetailOnlyDemo" )
    public void oneToOneUniDemo() {
        oneToOneUniCreate();
        System.out.println("Created list...........\n Show Saved item");
        instructorOneToOneBiDeleteInstructorDetailOnlyService.findAll().forEach(x -> System.out.println(x.toString()));
        oneToOneUniDelete();
        System.out.println("After delete one");
        instructorOneToOneBiDeleteInstructorDetailOnlyService.findAll().forEach(x -> System.out.println(x.toString()));

    }

    public void oneToOneUniCreate() {
        // create the objects
        InstructorOneToOneBiDeleteInstructorDetailOnly tempInstructor =
                new InstructorOneToOneBiDeleteInstructorDetailOnly("Asanka", "Lalith", "as@gmail.com");

        InstructorDetailOneToOneBiDeleteInstructorDetailOnly tempInstructorDetail =
                new InstructorDetailOneToOneBiDeleteInstructorDetailOnly(
                        "http://www.example.com/youtube",
                        "Cricket");

        InstructorOneToOneBiDeleteInstructorDetailOnly tempInstructor1 =
                new InstructorOneToOneBiDeleteInstructorDetailOnly("Nuwan ", "Bandara", "nuwan@gamil.com");

        InstructorDetailOneToOneBiDeleteInstructorDetailOnly tempInstructorDetail1 =
                new InstructorDetailOneToOneBiDeleteInstructorDetailOnly(
                        "http://www.example.com/youtube",
                        "Guitar");

        // associate the objects
        tempInstructor.setInstructorDetailOneToOneBiDeleteInstructorDetailOnly(tempInstructorDetail);
        tempInstructor1.setInstructorDetailOneToOneBiDeleteInstructorDetailOnly(tempInstructorDetail1);


        // save the instructor
        //
        // Note: this will ALSO save the details object
        // because of CascadeType.ALL
        //
        System.out.println("Saving instructor: ");
        System.out.println(instructorOneToOneBiDeleteInstructorDetailOnlyService.persist(tempInstructor).toString());
        System.out.println(instructorOneToOneBiDeleteInstructorDetailOnlyService.persist(tempInstructor1).toString());


        System.out.println("Done!");

    }

    public void oneToOneUniDelete() {


        // get instructor by primary key / id
        int index = instructorDetailOneToOneBiDeleteInstructorDetailOnlyService.findAll().size() - 1;
        InstructorDetailOneToOneBiDeleteInstructorDetailOnly tempInstructorDetail =
                instructorDetailOneToOneBiDeleteInstructorDetailOnlyService.findById(
                        instructorDetailOneToOneBiDeleteInstructorDetailOnlyService.findAll().get(index).getId());

        System.out.println("Found instructor: " + tempInstructorDetail.toString());

        // delete the instructors

        System.out.println("Deleting: " + tempInstructorDetail.toString());

        // Note: will ALSO delete associated "details" object
        // because of CascadeType.ALL
        //
        instructorDetailOneToOneBiDeleteInstructorDetailOnlyService.delete(tempInstructorDetail.getId());
    }
}
