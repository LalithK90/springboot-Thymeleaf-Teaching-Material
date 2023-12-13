package cyou.lositha.springehcacheexample.complete.seventhDay.task7.dao;

import cyou.lositha.springehcacheexample.complete.seventhDay.task7.entity.Task7;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task7Dao extends JpaRepository<Task7, Integer> {

}
