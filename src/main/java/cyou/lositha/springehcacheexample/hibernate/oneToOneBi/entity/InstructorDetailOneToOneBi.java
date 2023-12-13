package cyou.lositha.springehcacheexample.hibernate.oneToOneBi.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class InstructorDetailOneToOneBi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String youtubeChannel;

	private String hobby;

	// add new field for instructor (also add getter/setters)

	// add @OneToOne annotation

	@OneToOne(mappedBy = "instructorDetailOneToOneBi", cascade = CascadeType.ALL)
	private InstructorOneToOneBi instructorOneToOneBi;

	public InstructorDetailOneToOneBi(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
}
