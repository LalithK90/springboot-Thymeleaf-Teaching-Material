package lk.lalithk90.springboot_thymelaf.complete.sixthDay.task6.dao;


import lk.lalithk90.springboot_thymelaf.complete.sixthDay.task6.entity.Task6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task6Dao extends JpaRepository< Task6, Integer> {


}
