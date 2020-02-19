package lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="instructor_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDetailOneToOneUni {

	// annotate the class as an entity and map to db table :- @Entity
	
	// define the fields
	
	// annotate the fields with db column names
	
	// create constructors :- @AllArgsConstructor
	
	// generate getter/setter methods :- @Data
	
	// generate toString() method :- @ToString
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="id")
	private int id;
	
	//@Column(name="youtube_channel")
	private String youtubeChannel;
	
	//@Column(name="hobby")
	private String hobby;

    public InstructorDetailOneToOneUni(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
}







