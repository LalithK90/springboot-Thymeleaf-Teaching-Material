package lk.lalithk90.springbootthymelaf.kokis.service;

import lk.lalithk90.springbootthymelaf.kokis.dao.MixtureDao;
import lk.lalithk90.springbootthymelaf.kokis.entity.Mixture;
import org.springframework.stereotype.Service;

@Service
public class MixtureService {
    private final MixtureDao mixtureDao;

    public MixtureService(MixtureDao mixtureDao) {
        this.mixtureDao = mixtureDao;
    }

    //1. create
    public void create(Mixture mixture) {
        //mixture type entity
        mixtureDao.save(mixture);
    }

    //2. read
    //3. update
    //4. Delete

}
