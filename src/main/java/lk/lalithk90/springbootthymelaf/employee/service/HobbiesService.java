package lk.lalithk90.springbootthymelaf.employee.service;

import lk.lalithk90.springbootthymelaf.employee.dao.HobbiesDao;
import lk.lalithk90.springbootthymelaf.employee.entity.Hobbies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbiesService {
private final HobbiesDao hobbiesDao;

    public HobbiesService(HobbiesDao hobbiesDao) {
        this.hobbiesDao = hobbiesDao;
    }

    public List< Hobbies > findAll(){
    return hobbiesDao.findAll();
}
}
