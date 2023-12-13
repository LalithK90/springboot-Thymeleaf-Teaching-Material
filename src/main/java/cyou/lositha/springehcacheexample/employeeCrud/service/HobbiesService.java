package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.HobbiesRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Hobbies;
import cyou.lositha.springehcacheexample.final_class.util.interfaces.AbstractService;

@Service
public class HobbiesService implements AbstractService<Hobbies, Long> {
    private final HobbiesRepository hobbiesRepository;

    public HobbiesService(HobbiesRepository hobbiesRepository) {
        this.hobbiesRepository = hobbiesRepository;
    }

    public List<Hobbies> findAll() {
        return hobbiesRepository.findAll();
    }

   
    public Hobbies findById(Long id) {
        return hobbiesRepository.getReferenceById(id);
    }

   
    public Hobbies persist(Hobbies e) {
        return hobbiesRepository.save(e);
    }

   
    public boolean delete(Long id) {
        hobbiesRepository.deleteById(id);
        return false;
    }
}
