package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.controller;

import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.InstructorDetailEagerVsLazy;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.InstructorEagerVsLazy;
import org.springframework.stereotype.Controller;

@Controller
public class EagerVsLazyController {

    public void createInstructor() {
        // create the objects
			/*
			Instructor tempInstructor =
					new Instructor("Chad", "Darby", "darby@luv2code.com");

			InstructorDetail tempInstructorDetail =
					new InstructorDetail(
							"http://www.luv2code.com/youtube",
							"Luv 2 code!!!");
			*/

        InstructorEagerVsLazy tempInstructor =
                new InstructorEagerVsLazy("Madhu", "Patel", "madhu@luv2code.com");

        InstructorDetailEagerVsLazy tempInstructorDetail =
                new InstructorDetailEagerVsLazy(
                        "http://www.youtube.com",
                        "Guitar");

        // associate the objects
        		tempInstructor.setInstructorDetailEagerVsLazy(tempInstructorDetail);

        // save the instructor
        //
        // Note: this will ALSO save the details object
        // because of CascadeType.ALL
        //
        /*	System.out.println("Saving instructor: " + tempInstructor);*/


/*
			System.out.println("Done!");*/
    }
}
