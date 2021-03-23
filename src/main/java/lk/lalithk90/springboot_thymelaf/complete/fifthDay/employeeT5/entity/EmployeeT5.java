package lk.lalithk90.springboot_thymelaf.complete.fifthDay.employeeT5.entity;


import lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.entity.Task5;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT5 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

  @ManyToOne
  private Task5 task5;


}
