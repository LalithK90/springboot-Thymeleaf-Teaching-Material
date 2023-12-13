package cyou.lositha.springehcacheexample.final_class.person_task.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import cyou.lositha.springehcacheexample.final_class.person.entity.PersonFinal;
import cyou.lositha.springehcacheexample.final_class.person_task.entity.enums.PersonTaskStatus;
import cyou.lositha.springehcacheexample.final_class.task.entity.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonFinalTask {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate taskDateTime;

  @Enumerated(EnumType.STRING)
  private PersonTaskStatus personTaskStatus;

  @ManyToOne
  private PersonFinal personFinal;

  @ManyToOne
  private Task task;

}
