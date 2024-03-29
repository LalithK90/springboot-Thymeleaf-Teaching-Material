package cyou.lositha.springehcacheexample.employeeCrud.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
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
public class Gender implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Pay roll number is required")
    // @Column( unique = true )
    // @Size(min = 5)
    private String name;

    @OneToMany(mappedBy = "gender")
    private List<Employee> employees;

    public Gender(@NotNull(message = "Pay roll number is required") String name) {
        this.name = name;
    }

}
