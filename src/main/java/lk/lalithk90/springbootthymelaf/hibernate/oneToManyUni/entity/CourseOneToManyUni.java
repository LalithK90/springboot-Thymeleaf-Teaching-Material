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
public class CourseOneToManyUni {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String title;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="instructor_one_to_many_uni_id")
	private InstructorOneToManyUni instructorOneToManyUni;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List< ReviewOneToManyUni > reviewOneToManyUnis;
		

	// add a convenience method
	
	public void addReview(ReviewOneToManyUni theReviewOneToManyUni) {
	
		if ( reviewOneToManyUnis == null) {
			reviewOneToManyUnis = new ArrayList<>();
		}
		
		reviewOneToManyUnis.add(theReviewOneToManyUni);
	}

	
}



