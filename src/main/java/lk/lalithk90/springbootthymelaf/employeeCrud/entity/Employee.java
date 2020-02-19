package lk.lalithk90.springbootthymelaf.employeeCrud.entity;

import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Enum.CivilStatus;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @NotNull( message = "Name is required" )
    @Size( min = 5, message = "Your name cannot be accept" )
    private String name;

    @Size( max = 10, message = "Mobile number length should be contained 10 and 9" )
    private String mobile;

    @Size( max = 10, message = "Land number length should be contained 10 and 9" )
    private String land;

    @Email( message = "Provide valid email" )
    @Column( unique = true )
    private String email;

    private String address;

    @Enumerated(EnumType.STRING)
    private CivilStatus civilStatus;
    /*Date format */
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate dateOfBirth;
    /*Mapping -- start */
    @ManyToOne
    private Gender gender;

    @ManyToOne
    private Designation designation;

    @OneToMany(cascade = CascadeType.ALL)
    private List< Hobbies > hobbiesList;

    @OneToMany
    private List< WeekDay > weekDays;

}
