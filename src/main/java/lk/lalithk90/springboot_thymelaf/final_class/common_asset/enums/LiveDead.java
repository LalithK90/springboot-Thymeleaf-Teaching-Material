package lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LiveDead {
  ACTIVE("Active"),
  STOP("Stop");

  private final String liveDead;
}
