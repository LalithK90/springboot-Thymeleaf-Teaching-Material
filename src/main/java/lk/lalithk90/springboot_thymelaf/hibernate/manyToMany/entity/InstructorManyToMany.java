package lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorManyToMany {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_many_to_many_id")
	private InstructorDetailManyToMany instructorDetailManyToMany;

	@OneToMany(fetch=FetchType.LAZY,
			   mappedBy="instructorManyToMany",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List< CourseManyToMany > courseManyToManies;



	// add convenience methods for bi-directional relationship

	public void add(CourseManyToMany tempCourseManyToMany) {

		if ( courseManyToManies == null) {
			courseManyToManies = new ArrayList<>();
		}

		courseManyToManies.add(tempCourseManyToMany);

		tempCourseManyToMany.setInstructorManyToMany(this);
	}

}











