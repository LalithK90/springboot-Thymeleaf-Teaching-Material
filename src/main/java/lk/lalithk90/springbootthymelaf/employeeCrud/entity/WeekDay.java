package lk.lalithk90.springbootthymelaf.employeeCrud.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class WeekDay {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    private String name;
}
