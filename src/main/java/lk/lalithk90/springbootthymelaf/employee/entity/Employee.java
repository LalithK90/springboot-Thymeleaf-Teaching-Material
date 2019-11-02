package lk.lalithk90.springbootthymelaf.employee.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @NotNull( message = "Pay roll number is required" )
    @Column( unique = true )
    private String payRoleNumber;

    @Size( min = 5, message = "Your name cannot be accept" )
    private String name;

    @Size( min = 5, message = "At least 5 characters should be include calling name" )
    private String callingName;

    @Size( max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 " )
    @Column( unique = true )
    private String nic;

    @Column( unique = true )
    private String departmentIdNumber;

    @Size( max = 10, message = "Mobile number length should be contained 10 and 9" )
    private String mobileOne;
    @Size( max = 10, message = "Land number length should be contained 10 and 9" )
    private String land;

    @Email( message = "Provide valid email" )
    @Column( unique = true )
    private String email;

    private String address;

    /*Date format */
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate dateOfBirth;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate dateOfAssignment;

    /*Mapping -- start */
    @ManyToOne
    private Title title;

    @ManyToOne
    private Gender gender;

    @ManyToOne
    private Designation designation;

    @ManyToOne
    private CivilStatus civilStatus;

    @ManyToOne
    private EmployeeStatus employeeStatus;

/*    @OneToMany( mappedBy = "employee", fetch = FetchType.EAGER )
    @Fetch( value = FetchMode.SUBSELECT )
    private List< DetectionTeamMember > detectionTeamMembers;

    @OneToMany( mappedBy = "employee", fetch = FetchType.EAGER )
    private List< EmployeeWorkingPlaceHistory > employeeWorkingHistories;*/
}
