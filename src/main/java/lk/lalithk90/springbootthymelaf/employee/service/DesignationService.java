package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.DesignationDao;
import lk.lalithk90.springbootthymelaf.employee.entity.Designation;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationService implements AbstractService< Designation, Integer > {
    private final DesignationDao designationDao;

    @Autowired
    public DesignationService(DesignationDao designationDao) {
        this.designationDao = designationDao;
    }

    @Override
    public List< Designation > findAll() {
        return designationDao.findAll();
    }

    @Override
    public Designation findById(Integer id) {
        return null;
    }

    @Override
    public Designation persist(Designation designation) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< Designation > search(Designation designation) {
        return null;
    }
}
