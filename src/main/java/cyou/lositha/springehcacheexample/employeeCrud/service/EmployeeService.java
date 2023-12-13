package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.EmployeeRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Employee;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

import javax.cache.Cache;
import javax.cache.CacheManager;

@Service
@CacheConfig(cacheNames = "employee")
public class EmployeeService{
    @Autowired
    private CacheManager cacheManager;
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

   
    public List<Employee> findAll() {
        long dbCount = employeeRepository.count();
        System.out.println("db count " + dbCount);
        Cache<Long, Employee> cache = cacheManager.getCache("employee", Long.class, Employee.class);
        List<Employee> cacheStore = new ArrayList<>();
        List<Employee> finalCacheStore = cacheStore;
        System.out.println(cache);
        cache.forEach(entry -> {
            if (entry != null) {
                finalCacheStore.add(entry.getValue());
            }
        });
        if (!finalCacheStore.isEmpty() && dbCount == finalCacheStore.size()) {
            return finalCacheStore;
        } else {
            cacheStore = employeeRepository.findAll();
            cacheStore.forEach(x -> {
                cache.put(x.getId(), x);
            });
            System.out.println("find all");
            return cacheStore;
        }
    }

    @Cacheable(value = "employee", key = "#id")
    public Employee findById(Long id) {
        return employeeRepository.getReferenceById(id);
    }

    @CachePut(key = "#employee.id")
    public Employee persist(Employee employee) {
        return employeeRepository.save(employee);
    }

    @CacheEvict(key = "#id")
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
