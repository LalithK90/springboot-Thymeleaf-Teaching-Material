package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorOneToManyUni {
	// ** set up mapping to InstructorDetail entity

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_one_to_many_uni_id")
	private InstructorDetailOneToManyUni instructorDetailOneToManyUni;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instructorOneToManyUni", cascade = { CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<CourseOneToManyUni> courseOneToManyUnis;

	// add convenience methods for bi-directional relationship

	public void add(CourseOneToManyUni tempCourseOneToManyUni) {

		if (courseOneToManyUnis == null) {
			courseOneToManyUnis = new ArrayList<>();
		}

		courseOneToManyUnis.add(tempCourseOneToManyUni);

		tempCourseOneToManyUni.setInstructorOneToManyUni(this);
	}

}
