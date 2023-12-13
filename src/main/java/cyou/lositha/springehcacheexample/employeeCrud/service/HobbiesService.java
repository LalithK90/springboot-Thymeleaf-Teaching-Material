package cyou.lositha.springehcacheexample.employeeCrud.service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.HobbiesRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Hobbies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbiesService {
    private final HobbiesRepository hobbiesRepository;

    public HobbiesService(HobbiesRepository hobbiesRepository) {
        this.hobbiesRepository = hobbiesRepository;
    }

    public List<Hobbies> findAll() {
        return hobbiesRepository.findAll();
    }
}
