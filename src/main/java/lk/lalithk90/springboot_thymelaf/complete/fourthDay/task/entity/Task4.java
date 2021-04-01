package lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.entity;


import lk.lalithk90.springboot_thymelaf.common_thing.enums.Behavior;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task4 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated( EnumType.STRING )
  private Behavior behavior;

}
