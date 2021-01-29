package lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.service;

import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.dao.InstructorDetailManyToManyRepository;
import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.entity.InstructorDetailManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailManyToManyService {
    private final InstructorDetailManyToManyRepository instructorDetailManyToManyRepository;

    @Autowired
    public InstructorDetailManyToManyService(InstructorDetailManyToManyRepository instructorDetailManyToManyRepository) {
        this.instructorDetailManyToManyRepository = instructorDetailManyToManyRepository;
    }


    public List< InstructorDetailManyToMany > findAll() {
        return null;
    }


    public InstructorDetailManyToMany findById(Integer id) {
        return null;
    }


    public InstructorDetailManyToMany persist(InstructorDetailManyToMany instructorDetailManyToMany) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorDetailManyToMany > search(InstructorDetailManyToMany instructorDetailManyToMany) {
        return null;
    }
}
