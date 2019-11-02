package lk.lalithk90.springbootthymelaf.employee.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull( message = "Pay roll number is required" )
    @Column( unique = true )
    private String name;

    @OneToMany(mappedBy = "gender")
    private List<Employee> employees;
}
