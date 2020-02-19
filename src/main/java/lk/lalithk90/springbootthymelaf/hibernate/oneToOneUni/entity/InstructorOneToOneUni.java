package lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorOneToOneUni {
	
	// ** set up mapping to InstructorDetail entity

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String firstName,lastName,email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_one_to_one_uni_id")
	private InstructorDetailOneToOneUni instructorDetailOneToOneUni;


    public InstructorOneToOneUni(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}






