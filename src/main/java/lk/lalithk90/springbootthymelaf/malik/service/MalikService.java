package lk.lalithk90.springbootthymelaf.malik.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.malik.dao.MalikDao;
import lk.lalithk90.springbootthymelaf.malik.entity.Malik;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MalikService implements AbstractService<Malik,Integer> {
    private final MalikDao malikDao;

    public MalikService(MalikDao malikDao) {
        this.malikDao = malikDao;
    }

    //CRUD -> Create Read Update Delete
    //Create Update => Persist


    //1. findAll
    //2. findById
    //3. persist
    //4. delete
    //5. search

    public List<Malik> findAll() {
        return malikDao.findAll();
    }

    public Malik findById(Integer id) {
        return malikDao.getOne(id);
    }

    public Malik persist(Malik malik) {
        return malikDao.save(malik);
    }

    public boolean delete(Integer id) {
        malikDao.deleteById(id);
        return false;
    }

    public List<Malik> search(Malik malik) {
        return null;
    }


}
