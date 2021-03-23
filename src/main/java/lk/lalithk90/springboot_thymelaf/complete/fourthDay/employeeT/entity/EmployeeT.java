package lk.lalithk90.springboot_thymelaf.complete.fourthDay.employeeT.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeT {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  private String mobile;

}
