package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.TitleDao;
import lk.lalithk90.springbootthymelaf.employee.entity.Title;
import lk.lalithk90.springbootthymelaf.employee.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService implements AbstractService< Title, Integer > {
    private final TitleDao titleDao;

    @Autowired
    public TitleService(TitleDao titleDao) {
        this.titleDao = titleDao;
    }

    @Override
    public List< Title > findAll() {
        return titleDao.findAll();
    }

    @Override
    public Title findById(Integer id) {
        return null;
    }

    @Override
    public Title persist(Title title) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< Title > search(Title title) {
        return null;
    }
}
