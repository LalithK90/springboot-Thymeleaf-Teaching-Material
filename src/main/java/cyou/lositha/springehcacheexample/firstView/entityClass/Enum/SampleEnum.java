package cyou.lositha.springehcacheexample.firstView.entityClass.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SampleEnum {
    SAMPLE_ONE("Sample one"),
    SAMPLE_TWO("Sample two"),
    SAMPLE_THREE("Sample three");

    private final String sampleEnum;
}
