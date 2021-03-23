package lk.lalithk90.springboot_thymelaf.complete.sixthDay.employeeT6.dao;


import lk.lalithk90.springboot_thymelaf.complete.sixthDay.employeeT6.entity.EmployeeT6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeT6Dao extends JpaRepository< EmployeeT6, Integer> {


}
