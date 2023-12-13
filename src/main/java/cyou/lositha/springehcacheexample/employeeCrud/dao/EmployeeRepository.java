package cyou.lositha.springehcacheexample.employeeCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
