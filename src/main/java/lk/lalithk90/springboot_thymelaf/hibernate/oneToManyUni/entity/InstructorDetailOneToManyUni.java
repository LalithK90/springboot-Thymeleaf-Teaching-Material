package lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorDetailOneToManyUni {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String youtubeChannel;

	private String hobby;

	// add new field for instructor (also add getter/setters)

	// add @OneToOne annotation

	@OneToOne(mappedBy="instructorDetailOneToManyUni",
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	private InstructorOneToManyUni instructorOneToManyUni;


}







