package cyou.lositha.springehcacheexample.complete.fifthDay.task5.entity;

import java.util.List;

import cyou.lositha.springehcacheexample.common_thing.enums.Behavior;
import cyou.lositha.springehcacheexample.complete.fifthDay.employeeT5.entity.EmployeeT5;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task5 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

  @OneToMany(mappedBy = "task5")
  private List<EmployeeT5> employeeT5s;

}
