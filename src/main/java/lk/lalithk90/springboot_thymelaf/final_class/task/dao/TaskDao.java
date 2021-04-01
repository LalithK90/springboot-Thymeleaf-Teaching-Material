package lk.lalithk90.springboot_thymelaf.final_class.task.dao;

import lk.lalithk90.springboot_thymelaf.final_class.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository< Task, Integer > {
}
