package lk.lalithk90.springboot_thymelaf.complete.fourthDay.employeeT.dao;


import lk.lalithk90.springboot_thymelaf.complete.fourthDay.employeeT.entity.EmployeeT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTDao extends JpaRepository< EmployeeT, Integer> {

}
