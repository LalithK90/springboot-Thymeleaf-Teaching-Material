package cyou.lositha.springehcacheexample.final_class.task.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.final_class.task.dao.TaskDao;
import cyou.lositha.springehcacheexample.final_class.task.entity.Task;

@Service
public class TaskService {
  private final TaskDao taskDao;

  public TaskService(TaskDao taskDao) {
    this.taskDao = taskDao;
  }

  // 1. findTask all
  public List<Task> findAll() {
    return taskDao.findAll();
  }

  // 2. findTask By id
  public Task findById(Integer id) {
    // select * from Task4 where id =?
    return taskDao.getReferenceById(id);
  }
  // 3. saveTask updated task

  public Task persit(Task task) {
    return taskDao.save(task);
  }

  // 4. deleteTask
  public boolean delete(Integer id) {
    taskDao.deleteById(id);
    return false;
  }

}
