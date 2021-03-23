package lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.dao;


import lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.entity.Task5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task5Dao extends JpaRepository< Task5, Integer> {


}
