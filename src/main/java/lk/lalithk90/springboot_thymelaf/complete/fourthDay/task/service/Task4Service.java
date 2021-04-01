package lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.service;


import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.dao.Task4Dao;
import lk.lalithk90.springboot_thymelaf.complete.fourthDay.task.entity.Task4;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task4Service {


  private final Task4Dao task4Dao;

  public Task4Service(Task4Dao task4Dao) {
    this.task4Dao = task4Dao;
  }


  public List< Task4 > findAll() {
    return task4Dao.findAll();
  }


  public Task4 findById(Integer id) {
    return task4Dao.getOne(id);
  }


  public Task4 persist(Task4 task4) {

    return task4Dao.save(task4);
  }


  public void deleteById(Integer id) {
    task4Dao.deleteById(id);
  }
}
