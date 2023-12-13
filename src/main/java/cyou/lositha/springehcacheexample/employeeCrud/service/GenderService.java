package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.GenderRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Gender;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

@Service
public class GenderService {
    private final GenderRepository genderRepository;

    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

   
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

   
    public Gender findById(Long id) {
        return genderRepository.getReferenceById(id);
    }

   
    public Gender persist(Gender gender) {
        return genderRepository.save(gender);
    }

   
    public boolean delete(Long id) {
        genderRepository.deleteById(id);
        return true;
    }

   
    public List<Gender> search(Gender gender) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Gender> genderExample = Example.of(gender, matcher);
        return genderRepository.findAll(genderExample);
    }

    public Page<Gender> findAllPageable(Pageable pageable) {
        return genderRepository.findAll(pageable);
    }
}
