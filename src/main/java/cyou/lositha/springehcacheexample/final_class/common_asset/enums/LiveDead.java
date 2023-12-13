package cyou.lositha.springehcacheexample.final_class.common_asset.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LiveDead {
  ACTIVE("Active"),
  STOP("Stop");

  private final String liveDead;
}
