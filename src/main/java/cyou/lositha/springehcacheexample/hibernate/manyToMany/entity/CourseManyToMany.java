package cyou.lositha.springehcacheexample.hibernate.manyToMany.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseManyToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    @JoinColumn(name = "instructor_many_to_many_id")
    private InstructorManyToMany instructorManyToMany;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_many_to_many_id")
    private List<ReviewManyToMany> reviewManyToManies;

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "course_many_to_many_student_many_to_many", joinColumns = @JoinColumn(name = "course_many_to_many_id"), inverseJoinColumns = @JoinColumn(name = "student_many_to_many_id"))
    private List<StudentManyToMany> studentManyToManies;

    // add a convenience method

    public void addStudent(StudentManyToMany theStudentManyToMany) {

        if (studentManyToManies == null) {
            studentManyToManies = new ArrayList<>();
        }

        studentManyToManies.add(theStudentManyToMany);
    }

}
