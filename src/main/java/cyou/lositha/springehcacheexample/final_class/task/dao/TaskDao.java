package cyou.lositha.springehcacheexample.final_class.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.final_class.task.entity.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Integer> {
}
