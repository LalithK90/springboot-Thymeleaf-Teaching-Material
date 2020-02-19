package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorEagerVsLazy {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    private String firstName;

    private String lastName;

    private String email;

    @OneToOne( cascade = CascadeType.ALL )
    @JoinColumn( name = "instructor_detail_eager_vs_lazy_id" )
    private InstructorDetailEagerVsLazy instructorDetailEagerVsLazy;

    @OneToMany( fetch = FetchType.LAZY,
            mappedBy = "instructorEagerVsLazy",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH} )
    private List< CourseEagerVsLazy > courseEagerVsLazies;


    public InstructorEagerVsLazy(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}











