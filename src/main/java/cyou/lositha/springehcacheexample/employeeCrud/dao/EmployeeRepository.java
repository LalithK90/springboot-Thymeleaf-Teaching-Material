package cyou.lositha.springehcacheexample.employeeCrud.dao;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
