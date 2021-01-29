package lk.lalithk90.springboot_thymelaf.employeeCrud.entity;

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
@ToString
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull( message = "Pay roll number is required" )
   // @Column( unique = true )
    //@Size(min = 5)
    private String name;

    @OneToMany(mappedBy = "gender")
    private List<Employee> employees;
}
