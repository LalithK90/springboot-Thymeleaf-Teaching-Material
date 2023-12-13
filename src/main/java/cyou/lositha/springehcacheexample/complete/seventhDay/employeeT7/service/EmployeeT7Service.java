package cyou.lositha.springehcacheexample.complete.seventhDay.employeeT7.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.complete.seventhDay.employeeT7.dao.EmployeeT7Dao;
import cyou.lositha.springehcacheexample.complete.seventhDay.employeeT7.entity.EmployeeT7;

@Service
public class EmployeeT7Service {

  private final EmployeeT7Dao employeeT7Dao;

  public EmployeeT7Service(EmployeeT7Dao employeeT7Dao) {
    this.employeeT7Dao = employeeT7Dao;
  }

  public List<EmployeeT7> findAll() {
    return employeeT7Dao.findAll();
  }

  public EmployeeT7 findById(Integer id) {
    return employeeT7Dao.getReferenceById(id);
  }

  public EmployeeT7 persist(EmployeeT7 employeeT7) {

    return employeeT7Dao.save(employeeT7);
  }

  public void deleteById(Integer id) {
    employeeT7Dao.deleteById(id);
  }
}
