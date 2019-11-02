package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.EmployeeStatusDao;
import lk.lalithk90.springbootthymelaf.employee.entity.EmployeeStatus;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeStatusService implements AbstractService< EmployeeStatus, Integer > {
    private final EmployeeStatusDao employeeStatusDao;

    @Autowired
    public EmployeeStatusService(EmployeeStatusDao employeeStatusDao) {
        this.employeeStatusDao = employeeStatusDao;
    }

    @Override
    public List< EmployeeStatus > findAll() {
        return employeeStatusDao.findAll();
    }

    @Override
    public EmployeeStatus findById(Integer id) {
        return null;
    }

    @Override
    public EmployeeStatus persist(EmployeeStatus employeeStatus) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< EmployeeStatus > search(EmployeeStatus employeeStatus) {
        return null;
    }
}
