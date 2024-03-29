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
public class InstructorManyToMany {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_many_to_many_id")
	private InstructorDetailManyToMany instructorDetailManyToMany;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instructorManyToMany", cascade = { CascadeType.PERSIST,
			CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private List<CourseManyToMany> courseManyToManies;

	// add convenience methods for bi-directional relationship

	public void add(CourseManyToMany tempCourseManyToMany) {

		if (courseManyToManies == null) {
			courseManyToManies = new ArrayList<>();
		}

		courseManyToManies.add(tempCourseManyToMany);

		tempCourseManyToMany.setInstructorManyToMany(this);
	}

}
