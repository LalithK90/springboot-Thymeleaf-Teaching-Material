package cyou.lositha.springehcacheexample.complete.seventhDay.employeeT7.entity;

import java.util.List;

import cyou.lositha.springehcacheexample.complete.seventhDay.task7.entity.Task7;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class EmployeeT7 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  private String mobile;

  @ManyToMany
  @JoinTable(name = "employeet7_task7", joinColumns = @JoinColumn(name = "employeet7_id"), inverseJoinColumns = @JoinColumn(name = "task7s_id"))
  private List<Task7> task7s;

}
