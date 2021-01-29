package lk.lalithk90.springboot_thymelaf.firstView.entityClass.Enum;

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
