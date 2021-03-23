package lk.lalithk90.springboot_thymelaf.complete.sixthDay.task6.entity;


import lk.lalithk90.springboot_thymelaf.common_thing.enums.Behavior;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Task6 {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;

  private String name;

  @Enumerated( EnumType.STRING)
  private Behavior behavior;


}
