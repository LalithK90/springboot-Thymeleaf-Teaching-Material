package lk.lalithk90.springboot_thymelaf.pdfAndExcel.repository;

import lk.lalithk90.springboot_thymelaf.pdfAndExcel.entity.EmployeePdfAndExcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeePdfAndExcelDao extends JpaRepository<EmployeePdfAndExcel, Integer> {
    @Query(value = "select gender_id,count(gender_id) from employee_pdf_and_excel group by gender_id", nativeQuery=true)
    List<Object[]> findByGenderAndCountByGenderAndGropByGender();

    @Query("select address,count(address) from EmployeePdfAndExcel group by address")
    List<Object[]> findByAddressAndCountByAddressOrderByAddress();
/*@Query(value="")
    List<Object[]> findByGenderAndCountByGenderAndGenderOrderByGender();

    List<Object[]> findByGenderAndCountByGenderAndGenderOrderByGender();*/
}
