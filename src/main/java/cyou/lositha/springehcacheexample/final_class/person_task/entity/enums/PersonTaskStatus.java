package cyou.lositha.springehcacheexample.final_class.person_task.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PersonTaskStatus {
  AC("Active"),
  CL("Cancel");

  private final String personTaskStatus;

  // personTaskStatus.personTaskStatus
}
