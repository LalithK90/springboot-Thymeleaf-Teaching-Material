package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity;

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
public class InstructorDetailEagerVsLazy {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;


    private String youtubeChannel;


    private String hobby;

    // add new field for instructor (also add getter/setters)

    // add @OneToOne annotation

    @OneToOne( mappedBy = "instructorDetailEagerVsLazy",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
                    CascadeType.REFRESH} )
    private InstructorEagerVsLazy instructorEagerVsLazy;


    public InstructorDetailEagerVsLazy(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }
}







