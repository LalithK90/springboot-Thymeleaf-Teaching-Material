package cyou.lositha.springehcacheexample.final_class.task.entity;

import java.util.List;

import cyou.lositha.springehcacheexample.final_class.person_task.entity.PersonFinalTask;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  @OneToMany(mappedBy = "task")
  private List<PersonFinalTask> personFinalTasks;

}
