package lk.lalithk90.springboot_thymelaf.common_thing.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Behavior {
  OPTIONAL(" Optional "),
  COMPULSORY(" Compulsory");

  private final String behavior;
}
