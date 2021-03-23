package lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.dao;


import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository< Task, Integer> {


}
