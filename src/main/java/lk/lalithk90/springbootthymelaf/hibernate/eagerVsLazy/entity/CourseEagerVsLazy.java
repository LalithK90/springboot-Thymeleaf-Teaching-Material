package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseEagerVsLazy {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String title;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="instructor_eager_vs_lazy_id")
	private InstructorEagerVsLazy instructorEagerVsLazy;
	

}
