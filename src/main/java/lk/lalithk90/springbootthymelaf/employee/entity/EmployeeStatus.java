package lk.lalithk90.springbootthymelaf.employee.entity;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class EmployeeStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull( message = "Pay roll number is required" )
    @Column( unique = true )
    private String name;
}
