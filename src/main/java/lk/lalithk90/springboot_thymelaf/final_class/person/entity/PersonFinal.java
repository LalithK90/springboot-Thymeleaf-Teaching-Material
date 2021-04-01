package lk.lalithk90.springboot_thymelaf.final_class.person.entity;

import lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums.LiveDead;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonTask;
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
public class PersonFinal {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private Integer id;

  private String name;

  private String mobile;

  @Enumerated( EnumType.STRING )
  private LiveDead liveDead;

  @OneToMany( mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true )
  private List< PersonTask > personTasks;

}
