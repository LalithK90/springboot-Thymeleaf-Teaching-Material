package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.EmployeeRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Employee;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

@Service
public class EmployeeService implements AbstractService<Employee, Long> {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

   
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

   
    public Employee findById(Long id) {
        return employeeRepository.getReferenceById(id);
    }

   
    public Employee persist(Employee employee) {
        return employeeRepository.save(employee);
    }

   
    public boolean delete(Long id) {
        employeeRepository.deleteById(id);
        return false;
    }

   
    public List<Employee> search(Employee employee) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Employee> employeeExample = Example.of(employee, matcher);
        return employeeRepository.findAll(employeeExample);
    }
}
