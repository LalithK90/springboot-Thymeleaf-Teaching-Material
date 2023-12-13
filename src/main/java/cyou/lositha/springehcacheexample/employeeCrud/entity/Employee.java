package cyou.lositha.springehcacheexample.employeeCrud.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Enum.CivilStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@EqualsAndHashCode
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
    @ManyToOne
    private Gender gender;

    @ManyToOne
    private Designation designation;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Hobbies> hobbiesList;

    @OneToMany
    private List<WeekDay> weekDays;

}
