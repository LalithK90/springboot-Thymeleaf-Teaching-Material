package cyou.lositha.springehcacheexample.complete.fourthDay.employeeT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.complete.fourthDay.employeeT.dao.EmployeeTDao;
import cyou.lositha.springehcacheexample.complete.fourthDay.employeeT.entity.EmployeeT;

@Service
public class EmployeeTService {

  private final EmployeeTDao employeeTDao;

  public EmployeeTService(EmployeeTDao employeeTDao) {
    this.employeeTDao = employeeTDao;
  }

  public List<EmployeeT> findAll() {
    return employeeTDao.findAll();
  }

  public EmployeeT findById(Integer id) {
    return employeeTDao.getReferenceById(id);
  }

  public EmployeeT persist(EmployeeT employeeT) {

    return employeeTDao.save(employeeT);
  }

  public void deleteById(Integer id) {
    employeeTDao.deleteById(id);
  }
}
