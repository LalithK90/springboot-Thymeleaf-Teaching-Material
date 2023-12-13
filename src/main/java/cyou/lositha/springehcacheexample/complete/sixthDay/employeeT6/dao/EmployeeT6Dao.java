package cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.dao;

import cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.entity.EmployeeT6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeT6Dao extends JpaRepository<EmployeeT6, Integer> {

}
