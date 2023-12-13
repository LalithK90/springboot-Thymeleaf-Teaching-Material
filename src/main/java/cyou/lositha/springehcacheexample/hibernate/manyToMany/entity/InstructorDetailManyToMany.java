package cyou.lositha.springehcacheexample.hibernate.manyToMany.entity;

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
public class InstructorDetailManyToMany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String youtubeChannel;

	private String hobby;

	// add new field for instructor (also add getter/setters)

	// add @OneToOne annotation

	@OneToOne(mappedBy = "instructorDetailManyToMany", cascade = { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH })
	private InstructorManyToMany instructorManyToMany;

}
