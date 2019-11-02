package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.CivilStatusDao;
import lk.lalithk90.springbootthymelaf.employee.entity.CivilStatus;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CivilStatusService implements AbstractService< CivilStatus, Integer > {
    private final CivilStatusDao civilStatusDao;

    @Autowired
    public CivilStatusService(CivilStatusDao civilStatusDao) {
        this.civilStatusDao = civilStatusDao;
    }

    @Override
    public List< CivilStatus > findAll() {
        return civilStatusDao.findAll();
    }

    @Override
    public CivilStatus findById(Integer id) {
        return null;
    }

    @Override
    public CivilStatus persist(CivilStatus civilStatus) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< CivilStatus > search(CivilStatus civilStatus) {
        return null;
    }
}
