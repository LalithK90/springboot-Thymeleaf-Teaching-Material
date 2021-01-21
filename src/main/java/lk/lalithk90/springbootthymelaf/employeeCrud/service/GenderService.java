package lk.lalithk90.springbootthymelaf.employeeCrud.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.dao.GenderRepository;
import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Gender;
import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService implements AbstractService<Gender, Integer> {
    private final GenderRepository genderRepository;

    @Autowired
    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public Gender findById(Integer id) {
        return genderRepository.getOne(id);
    }

    @Override
    public Gender persist(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    public boolean delete(Integer id) {
        genderRepository.deleteById(id);
        return true;
    }

    @Override
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
