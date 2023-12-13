package cyou.lositha.springehcacheexample.final_class.person.entity;

import java.util.List;

import cyou.lositha.springehcacheexample.final_class.common_asset.enums.LiveDead;
import cyou.lositha.springehcacheexample.final_class.person_task.entity.PersonFinalTask;
import jakarta.persistence.*;
import jakarta.persistence.Enumerated;
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
public class PersonFinal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String mobile;

  @Enumerated(EnumType.STRING)
  private LiveDead liveDead;

  @OneToMany(mappedBy = "personFinal", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<PersonFinalTask> personFinalTasks;

}
