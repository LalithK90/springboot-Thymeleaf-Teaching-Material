package cyou.lositha.springehcacheexample.years.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "years")
public class Years implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OrderBy("id")
    private Long id;

    @Column(unique = true)
    private int year;

}
