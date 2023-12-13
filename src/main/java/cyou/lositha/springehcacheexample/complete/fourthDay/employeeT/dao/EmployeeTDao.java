package cyou.lositha.springehcacheexample.complete.fourthDay.employeeT.dao;

import cyou.lositha.springehcacheexample.complete.fourthDay.employeeT.entity.EmployeeT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTDao extends JpaRepository<EmployeeT, Integer> {

}
