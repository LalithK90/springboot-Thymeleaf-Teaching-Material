package cyou.lositha.springehcacheexample.complete.seventhDay.task7.entity;

import java.util.List;

import cyou.lositha.springehcacheexample.common_thing.enums.Behavior;
import cyou.lositha.springehcacheexample.complete.seventhDay.employeeT7.entity.EmployeeT7;
import jakarta.persistence.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Task7 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Behavior behavior;

  @ManyToMany(mappedBy = "task7s")
  private List<EmployeeT7> employeeT7s;

}
