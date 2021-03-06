package lk.lalithk90.springboot_thymelaf.employeeCrud.dao;

import lk.lalithk90.springboot_thymelaf.employeeCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository< Employee, Integer > {
}
