package cyou.lositha.springehcacheexample.exampleResourceClass;

import lombok.*;

import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Simple02 {
    private UUID id;
    private String name;
    private String mobileNo;

}
