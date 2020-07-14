package lk.lalithk90.springbootthymelaf.gampaha.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Employee;
import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.gampaha.dao.GampahaDao;
import lk.lalithk90.springbootthymelaf.gampaha.entity.Gampaha;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GampahaService implements AbstractService<Gampaha, Integer> {
    //CRUD
    private final GampahaDao gampahaDao;

    public GampahaService(GampahaDao gampahaDao) {
        this.gampahaDao = gampahaDao;
    }


    public List<Gampaha> findAll() {
        return gampahaDao.findAll();
    }

    public Gampaha findById(Integer id) {
        return gampahaDao.getOne(id);
    }

    public Gampaha persist(Gampaha gampaha) {
        return gampahaDao.save(gampaha);
    }

    public boolean delete(Integer id) {
        gampahaDao.deleteById(id);
        return true;
    }

    public List<Gampaha> search(Gampaha gampaha) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Gampaha> gampahaExample = Example.of(gampaha, matcher);
        return gampahaDao.findAll(gampahaExample);
    }
}
