package cyou.lositha.springehcacheexample.pdfAndExcel.entity;

import org.springframework.web.multipart.MultipartFile;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeePdfAndExcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name, email, mobile, address;

    @Transient
    private MultipartFile multipartFile;

    @ManyToOne
    private Gender gender;

    public EmployeePdfAndExcel(String name, String email, String mobile, String address) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

}
