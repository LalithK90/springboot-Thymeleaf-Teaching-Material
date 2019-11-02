package lk.lalithk90.springbootthymelaf.employee.dao;

import lk.lalithk90.springbootthymelaf.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository< Employee, Integer > {
}
