package lk.lalithk90.springbootthymelaf.hibernate.manyToMany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentManyToMany {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;
	
	@ManyToMany(fetch=FetchType.LAZY,
			cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_many_to_many_student_many_to_many",
			joinColumns=@JoinColumn(name="student_many_to_many_id"),
			inverseJoinColumns=@JoinColumn(name="course_many_to_many_id")
			)	
	private List< CourseManyToMany > courseManyToManies;


}




