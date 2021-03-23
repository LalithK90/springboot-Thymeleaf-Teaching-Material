package lk.lalithk90.springboot_thymelaf.complete.thirdDay.dao;


import lk.lalithk90.springboot_thymelaf.complete.thirdDay.entity.EmployeeOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeOneDao extends JpaRepository< EmployeeOne, Integer> {

}
