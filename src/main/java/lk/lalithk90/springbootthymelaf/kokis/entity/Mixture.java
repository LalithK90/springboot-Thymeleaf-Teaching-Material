package lk.lalithk90.springbootthymelaf.kokis.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mixture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flour;

    @Column(nullable = false)
    private String coconutMilk;

    private String salt;

    @Size(min = 1,message = "This filed is required")
    private String egg;
    private String sugar;

}
