package cyou.lositha.springehcacheexample.complete.seventhDay.task7.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.complete.seventhDay.task7.dao.Task7Dao;
import cyou.lositha.springehcacheexample.complete.seventhDay.task7.entity.Task7;

@Service
public class Task7Service {

  private final Task7Dao task7Dao;

  public Task7Service(Task7Dao task7Dao) {
    this.task7Dao = task7Dao;
  }

  public List<Task7> findAll() {
    return task7Dao.findAll();
  }

  public Task7 findById(Integer id) {
    return task7Dao.getReferenceById(id);
  }

  public Task7 persist(Task7 task7) {

    return task7Dao.save(task7);
  }

  public void deleteById(Integer id) {
    task7Dao.deleteById(id);
  }
}
