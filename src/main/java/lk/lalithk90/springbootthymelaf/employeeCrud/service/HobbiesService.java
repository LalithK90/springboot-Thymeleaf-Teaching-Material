package lk.lalithk90.springbootthymelaf.employeeCrud.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.dao.HobbiesRepository;
import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Hobbies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbiesService {
private final HobbiesRepository hobbiesRepository;

    public HobbiesService(HobbiesRepository hobbiesRepository) {
        this.hobbiesRepository = hobbiesRepository;
    }

    public List< Hobbies > findAll(){
    return hobbiesRepository.findAll();
}
}
