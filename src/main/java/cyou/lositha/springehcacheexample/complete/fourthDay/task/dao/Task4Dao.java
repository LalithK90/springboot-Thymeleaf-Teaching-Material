package cyou.lositha.springehcacheexample.complete.fourthDay.task.dao;

import cyou.lositha.springehcacheexample.complete.fourthDay.task.entity.Task4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task4Dao extends JpaRepository<Task4, Integer> {

}
