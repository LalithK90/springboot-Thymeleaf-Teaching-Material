package lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.dao;


import lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.entity.EmployeeT7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeT7Dao extends JpaRepository< EmployeeT7, Integer> {


}
