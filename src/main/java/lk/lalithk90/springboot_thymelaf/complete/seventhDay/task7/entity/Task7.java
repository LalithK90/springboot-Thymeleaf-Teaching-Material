package lk.lalithk90.springboot_thymelaf.complete.seventhDay.task7.entity;


import lk.lalithk90.springboot_thymelaf.common_thing.enums.Behavior;
import lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.entity.EmployeeT7;
import lombok.*;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task7 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated( EnumType.STRING)
  private Behavior behavior;

  @ManyToMany(mappedBy = "task7s")
  private List< EmployeeT7 > employeeT7s;

}
