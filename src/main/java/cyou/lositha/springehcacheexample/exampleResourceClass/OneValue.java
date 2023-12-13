package cyou.lositha.springehcacheexample.exampleResourceClass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OneValue {
    MALE("Male");

    private String oneValue;
}
