package cyou.lositha.springehcacheexample.common_thing.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Behavior {
  OPTIONAL(" Optional "),
  COMPULSORY(" Compulsory");

  private final String behavior;
}
