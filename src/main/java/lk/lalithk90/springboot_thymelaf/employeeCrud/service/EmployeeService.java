package lk.lalithk90.springboot_thymelaf.employeeCrud.service;

import lk.lalithk90.springboot_thymelaf.employeeCrud.dao.EmployeeRepository;
import lk.lalithk90.springboot_thymelaf.employeeCrud.entity.Employee;
import lk.lalithk90.springboot_thymelaf.employeeCrud.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements AbstractService< Employee, Integer > {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List< Employee > findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public Employee persist(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean delete(Integer id) {
        employeeRepository.deleteById(id);
        return false;
    }

    @Override
    public List< Employee > search(Employee employee) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example< Employee > employeeExample = Example.of(employee, matcher);
        return employeeRepository.findAll(employeeExample);
    }
}
