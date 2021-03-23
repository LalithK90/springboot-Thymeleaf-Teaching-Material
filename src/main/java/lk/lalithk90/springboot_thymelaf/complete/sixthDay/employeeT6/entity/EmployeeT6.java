package lk.lalithk90.springboot_thymelaf.complete.sixthDay.employeeT6.entity;


import lk.lalithk90.springboot_thymelaf.complete.sixthDay.task6.entity.Task6;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT6 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

  @OneToMany
  private List< Task6 > task6s;

}
