package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.EmployeeDao;
import lk.lalithk90.springbootthymelaf.employee.entity.Employee;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements AbstractService< Employee, Integer > {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List< Employee > findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return null;
    }

    @Override
    public Employee persist(Employee employee) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< Employee > search(Employee employee) {
        return null;
    }
}
