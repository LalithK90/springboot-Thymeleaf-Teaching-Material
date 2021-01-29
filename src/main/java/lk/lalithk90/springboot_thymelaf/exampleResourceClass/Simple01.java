package lk.lalithk90.springboot_thymelaf.exampleResourceClass;

import lombok.*;

import java.util.List;
import java.util.UUID;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Simple01 {

    private UUID id = UUID.randomUUID();
    private String name;
    private String mobileNo;
    private String address;

    private List< Simple02 > simple02s;

}
