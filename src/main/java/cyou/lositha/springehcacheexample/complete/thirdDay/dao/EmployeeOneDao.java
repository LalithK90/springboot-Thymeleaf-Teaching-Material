package cyou.lositha.springehcacheexample.complete.thirdDay.dao;

import cyou.lositha.springehcacheexample.complete.thirdDay.entity.EmployeeOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeOneDao extends JpaRepository<EmployeeOne, Integer> {

}
