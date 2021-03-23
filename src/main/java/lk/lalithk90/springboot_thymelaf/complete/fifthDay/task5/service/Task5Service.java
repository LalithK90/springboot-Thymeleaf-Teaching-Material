package lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.service;


import lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.dao.Task5Dao;
import lk.lalithk90.springboot_thymelaf.complete.fifthDay.task5.entity.Task5;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task5Service {


  private final Task5Dao task5Dao;

  public Task5Service(Task5Dao task5Dao) {
    this.task5Dao = task5Dao;
  }


  public List< Task5 > findAll() {
    return task5Dao.findAll();
  }


  public Task5 findById(Integer id) {
    return task5Dao.getOne(id);
  }


  public Task5 persist(Task5 task5) {

    return task5Dao.save(task5);
  }


  public void deleteById(Integer id) {
    task5Dao.deleteById(id);
  }
}
