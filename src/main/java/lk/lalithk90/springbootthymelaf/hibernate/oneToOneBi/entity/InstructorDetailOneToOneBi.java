package lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InstructorDetailOneToOneBi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String youtubeChannel;

	private String hobby;
	
	// add new field for instructor (also add getter/setters)
	
	// add @OneToOne annotation
	
	@OneToOne(mappedBy="instructorDetailOneToOneBi", cascade=CascadeType.ALL)
	private InstructorOneToOneBi instructorOneToOneBi;

	public InstructorDetailOneToOneBi(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
}







