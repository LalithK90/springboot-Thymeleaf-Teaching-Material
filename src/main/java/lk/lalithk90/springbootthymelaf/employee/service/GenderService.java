package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.GenderDao;
import lk.lalithk90.springbootthymelaf.employee.entity.Gender;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService implements AbstractService< Gender, Integer > {
    private final GenderDao genderDao;

    @Autowired
    public GenderService(GenderDao genderDao) {
        this.genderDao = genderDao;
    }

    @Override
    public List< Gender > findAll() {
        return genderDao.findAll();
    }

    @Override
    public Gender findById(Integer id) {
        return null;
    }

    @Override
    public Gender persist(Gender gender) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< Gender > search(Gender gender) {
        return null;
    }
}
