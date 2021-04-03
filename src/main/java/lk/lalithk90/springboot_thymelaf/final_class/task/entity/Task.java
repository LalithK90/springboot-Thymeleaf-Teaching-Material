package lk.lalithk90.springboot_thymelaf.final_class.task.entity;

import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonFinalTask;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private Integer id;

  private String name;

  @OneToMany( mappedBy = "task" )
  private List< PersonFinalTask > personFinalTasks;

}
