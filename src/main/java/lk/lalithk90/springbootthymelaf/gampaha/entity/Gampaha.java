package lk.lalithk90.springbootthymelaf.gampaha.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Gampaha {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    private String name;

    private String age;


}
