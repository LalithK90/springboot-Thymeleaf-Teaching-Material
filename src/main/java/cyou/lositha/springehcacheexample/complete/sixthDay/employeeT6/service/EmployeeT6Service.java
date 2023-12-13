package cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.dao.EmployeeT6Dao;
import cyou.lositha.springehcacheexample.complete.sixthDay.employeeT6.entity.EmployeeT6;

@Service
public class EmployeeT6Service {

  private final EmployeeT6Dao employeeT6Dao;

  public EmployeeT6Service(EmployeeT6Dao employeeT6Dao) {
    this.employeeT6Dao = employeeT6Dao;
  }

  public List<EmployeeT6> findAll() {
    return employeeT6Dao.findAll();
  }

  public EmployeeT6 findById(Integer id) {
    return employeeT6Dao.getReferenceById(id);
  }

  public EmployeeT6 persist(EmployeeT6 employeeT6) {

    return employeeT6Dao.save(employeeT6);
  }

  public void deleteById(Integer id) {
    employeeT6Dao.deleteById(id);
  }
}
