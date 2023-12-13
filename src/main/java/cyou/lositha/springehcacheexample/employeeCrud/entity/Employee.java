package cyou.lositha.springehcacheexample.employeeCrud.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Enum.CivilStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name is required")
    @Size(min = 5, message = "Your name cannot be accept")
    private String name;

    @Size(max = 10, message = "Mobile number length should be contained 10 and 9")
    private String mobile;

    @Size(max = 10, message = "Land number length should be contained 10 and 9")
    private String land;

    @Email(message = "Provide valid email")
    @Column(unique = true)
    private String email;

    private String address;

    @Enumerated(EnumType.STRING)
    private CivilStatus civilStatus;
    /* Date format */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    /* Mapping -- start */
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Gender gender;

    @ManyToOne(fetch = FetchType.EAGER)
    private Designation designation;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Hobbies> hobbiesList;

    @OneToMany
    private List<WeekDay> weekDays;

}
