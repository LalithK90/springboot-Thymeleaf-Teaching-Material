package cyou.lositha.springehcacheexample.hibernate.oneToMany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
public class InstructorOneToMany {

	// ** set up mapping to InstructorDetail entity

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_one_to_many_id")
	private InstructorDetailOneToMany instructorDetailOneToMany;

	@OneToMany(mappedBy = "instructorOneToMany", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<CourseOneToMany> courseOneToManies;

	public InstructorOneToMany(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// add convenience methods for bi-directional relationship

	/*
	 * public void add(CourseOneToMany tempCourseOneToMany) {
	 * 
	 * if ( courseOneToManies == null) {
	 * courseOneToManies = new ArrayList<>();
	 * }
	 * courseOneToManies.add(tempCourseOneToMany);
	 * 
	 * tempCourseOneToMany.setInstructorOneToMany(this);
	 * }
	 */

}
