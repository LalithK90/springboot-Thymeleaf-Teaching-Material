package lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.entity;


import lk.lalithk90.springboot_thymelaf.common_thing.enums.Behavior;
import lk.lalithk90.springboot_thymelaf.complete.fifthDay.employeeT5.entity.EmployeeT5;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task5 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated( EnumType.STRING)
  private Behavior behavior;

 @OneToMany(mappedBy = "task5")
  private List< EmployeeT5 > employeeT5s;

}
