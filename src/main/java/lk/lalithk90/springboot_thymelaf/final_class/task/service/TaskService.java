package lk.lalithk90.springboot_thymelaf.final_class.task.service;


import lk.lalithk90.springboot_thymelaf.final_class.task.dao.TaskDao;
import lk.lalithk90.springboot_thymelaf.final_class.task.entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
  private final TaskDao taskDao;

  public TaskService(TaskDao taskDao) {
    this.taskDao = taskDao;
  }

  // 1. findTask all
  public List< Task > findAll() {
    return taskDao.findAll();
  }

  // 2. findTask By id
  public Task findById(Integer id) {
    //select * from Task where id =?
    return taskDao.getOne(id);
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
