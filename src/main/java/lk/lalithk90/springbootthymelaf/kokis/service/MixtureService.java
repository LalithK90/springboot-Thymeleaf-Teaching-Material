package lk.lalithk90.springbootthymelaf.kokis.service;

import lk.lalithk90.springbootthymelaf.kokis.dao.MixtureDao;
import lk.lalithk90.springbootthymelaf.kokis.entity.Mixture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MixtureService {
    private final MixtureDao mixtureDao;

    public MixtureService(MixtureDao mixtureDao) {
        this.mixtureDao = mixtureDao;
    }

    //1. create //3. update
    public void persist(Mixture mixture) {
        //mixture type entity
        mixtureDao.save(mixture);
    }

    //2. read
    public Mixture findById(int id) {
        return mixtureDao.getOne(id);
    }

    //4. Delete
    public void delete(int id) {
        mixtureDao.deleteById(id);
    }


    public List<Mixture> findAll() {
        return mixtureDao.findAll();
    }
}
