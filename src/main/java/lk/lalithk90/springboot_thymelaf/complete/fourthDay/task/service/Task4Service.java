package lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.service;


import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.dao.Task4Dao;
import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task4Service {


  private final Task4Dao task4Dao;

  public Task4Service(Task4Dao task4Dao) {
    this.task4Dao = task4Dao;
  }


  public List< Task > findAll() {
    return task4Dao.findAll();
  }


  public Task findById(Integer id) {
    return task4Dao.getOne(id);
  }


  public Task persist(Task task) {

    return task4Dao.save(task);
  }


  public void deleteById(Integer id) {
    task4Dao.deleteById(id);
  }
}
