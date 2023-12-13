package cyou.lositha.springehcacheexample.complete.fifthDay.task5.dao;

import cyou.lositha.springehcacheexample.complete.fifthDay.task5.entity.Task5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task5Dao extends JpaRepository<Task5, Integer> {

}
