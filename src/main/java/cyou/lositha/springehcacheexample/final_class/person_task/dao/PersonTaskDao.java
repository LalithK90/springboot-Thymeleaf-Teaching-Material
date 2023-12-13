package cyou.lositha.springehcacheexample.final_class.person_task.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.final_class.person_task.entity.PersonFinalTask;

@Repository
public interface PersonTaskDao extends JpaRepository<PersonFinalTask, Integer> {
}
