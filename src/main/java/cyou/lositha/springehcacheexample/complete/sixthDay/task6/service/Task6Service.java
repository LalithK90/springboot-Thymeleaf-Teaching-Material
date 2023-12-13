package cyou.lositha.springehcacheexample.complete.sixthDay.task6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.complete.sixthDay.task6.dao.Task6Dao;
import cyou.lositha.springehcacheexample.complete.sixthDay.task6.entity.Task6;

@Service
public class Task6Service {

  private final Task6Dao task6Dao;

  public Task6Service(Task6Dao task6Dao) {
    this.task6Dao = task6Dao;
  }

  public List<Task6> findAll() {
    return task6Dao.findAll();
  }

  public Task6 findById(Integer id) {
    return task6Dao.getReferenceById(id);
  }

  public Task6 persist(Task6 task6) {

    return task6Dao.save(task6);
  }

  public void deleteById(Integer id) {
    task6Dao.deleteById(id);
  }
}
