package lk.lalithk90.springboot_thymelaf.final_class.person_task.dao;

import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonTaskDao extends JpaRepository< PersonTask, Integer > {
}
