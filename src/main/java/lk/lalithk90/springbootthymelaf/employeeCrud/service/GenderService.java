package lk.lalithk90.springbootthymelaf.employeeCrud.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.dao.GenderRepository;
import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Gender;
import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService implements AbstractService< Gender, Integer > {
    private final GenderRepository genderRepository;

    @Autowired
    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    @Override
    public List< Gender > findAll() {
        return genderRepository.findAll();
    }

    @Override
    public Gender findById(Integer id) {
        return null;
    }

    @Override
    public Gender persist(Gender gender) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List< Gender > search(Gender gender) {
        return null;
    }
}
