package lk.lalithk90.springboot_thymelaf.final_class.person_task.entity;


import lk.lalithk90.springboot_thymelaf.final_class.person.entity.PersonFinal;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.enums.PersonTaskStatus;
import lk.lalithk90.springboot_thymelaf.final_class.task.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonTask {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private Integer id;


  @DateTimeFormat( pattern = "yyyy-MM-dd" )
  private LocalDate taskDateTime;

  @Enumerated( EnumType.STRING )
  private PersonTaskStatus personTaskStatus;

  @ManyToOne
  private PersonFinal personFinal;

  @ManyToOne
  private Task task;


}
