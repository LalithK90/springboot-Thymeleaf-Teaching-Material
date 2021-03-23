package lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.service;


import lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.dao.EmployeeT7Dao;
import lk.lalithk90.springboot_thymelaf.complete.seventhDay.employeeT7.entity.EmployeeT7;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeT7Service {


  private final EmployeeT7Dao employeeT7Dao;

  public EmployeeT7Service(EmployeeT7Dao employeeT7Dao) {
    this.employeeT7Dao = employeeT7Dao;
  }


  public List< EmployeeT7 > findAll() {
    return employeeT7Dao.findAll();
  }


  public EmployeeT7 findById(Integer id) {
    return employeeT7Dao.getOne(id);
  }


  public EmployeeT7 persist(EmployeeT7 employeeT7) {

    return employeeT7Dao.save(employeeT7);
  }


  public void deleteById(Integer id) {
    employeeT7Dao.deleteById(id);
  }
}
