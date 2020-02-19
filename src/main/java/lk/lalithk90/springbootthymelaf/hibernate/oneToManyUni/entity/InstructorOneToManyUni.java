package lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorOneToManyUni {
	// ** set up mapping to InstructorDetail entity

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_one_to_many_uni_id")
	private InstructorDetailOneToManyUni instructorDetailOneToManyUni;
	
	@OneToMany(fetch=FetchType.LAZY,
			   mappedBy="instructorOneToManyUni",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List< CourseOneToManyUni > courseOneToManyUnis;
	
	

	// add convenience methods for bi-directional relationship
	
	public void add(CourseOneToManyUni tempCourseOneToManyUni) {
		
		if ( courseOneToManyUnis == null) {
			courseOneToManyUnis = new ArrayList<>();
		}
		
		courseOneToManyUnis.add(tempCourseOneToManyUni);
		
		tempCourseOneToManyUni.setInstructorOneToManyUni(this);
	}
	
}











