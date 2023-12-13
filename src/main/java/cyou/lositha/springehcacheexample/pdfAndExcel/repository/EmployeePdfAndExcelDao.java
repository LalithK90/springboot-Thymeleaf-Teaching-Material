package cyou.lositha.springehcacheexample.pdfAndExcel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.pdfAndExcel.entity.EmployeePdfAndExcel;

@Repository
public interface EmployeePdfAndExcelDao extends JpaRepository<EmployeePdfAndExcel, Integer> {
    @Query(value = "select gender_id,count(gender_id) from employee_pdf_and_excel group by gender_id", nativeQuery = true)
    List<Object[]> findByGenderAndCountByGenderAndGropByGender();

    @Query("select address,count(address) from EmployeePdfAndExcel group by address")
    List<Object[]> findByAddressAndCountByAddressOrderByAddress();
    /*
     * @Query(value="")
     * List<Object[]> findByGenderAndCountByGenderAndGenderOrderByGender();
     * 
     * List<Object[]> findByGenderAndCountByGenderAndGenderOrderByGender();
     */
}
