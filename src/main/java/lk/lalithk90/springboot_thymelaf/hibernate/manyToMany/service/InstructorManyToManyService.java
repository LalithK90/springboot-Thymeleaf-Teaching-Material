package lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.service;

import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.dao.InstructorManyToManyRepository;
import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.entity.InstructorManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorManyToManyService {
    private final InstructorManyToManyRepository instructorManyToManyRepository;

    @Autowired
    public InstructorManyToManyService(InstructorManyToManyRepository instructorManyToManyRepository) {
        this.instructorManyToManyRepository = instructorManyToManyRepository;
    }


    public List< InstructorManyToMany > findAll() {
        return null;
    }


    public InstructorManyToMany findById(Integer id) {
        return null;
    }


    public InstructorManyToMany persist(InstructorManyToMany instructorManyToMany) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorManyToMany > search(InstructorManyToMany instructorManyToMany) {
        return null;
    }
}
