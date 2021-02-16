package lk.lalithk90.springboot_thymelaf.pdfAndExcel.entity;

import lk.lalithk90.springboot_thymelaf.employeeCrud.entity.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeePdfAndExcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name, email, mobile,address;

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
