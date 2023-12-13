package cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class InstructorOneToOneBiDeleteInstructorDetailOnly {

	// ** set up mapping to InstructorDetail entity

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;

	private String lastName;

	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_one_to_one_bi_delete_instructor_detail_only_id")
	private InstructorDetailOneToOneBiDeleteInstructorDetailOnly instructorDetailOneToOneBiDeleteInstructorDetailOnly;

	public InstructorOneToOneBiDeleteInstructorDetailOnly(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}
