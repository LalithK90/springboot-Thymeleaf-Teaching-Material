package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.EmployeeDao;
import lk.lalithk90.springbootthymelaf.employee.entity.Employee;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
        return employeeDao.getOne(id);
    }

    @Override
    public Employee persist(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public boolean delete(Integer id) {
        employeeDao.deleteById(id);
        return false;
    }

    @Override
    public List< Employee > search(Employee employee) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example< Employee > employeeExample = Example.of(employee, matcher);
        return employeeDao.findAll(employeeExample);
    }
}
