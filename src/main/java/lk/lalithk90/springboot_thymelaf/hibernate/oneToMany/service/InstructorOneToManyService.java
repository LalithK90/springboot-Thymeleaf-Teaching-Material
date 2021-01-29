package lk.lalithk90.springboot_thymelaf.hibernate.oneToMany.service;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToMany.dao.InstructorOneToManyRepository;
import lk.lalithk90.springboot_thymelaf.hibernate.oneToMany.entity.InstructorOneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorOneToManyService {
    private final InstructorOneToManyRepository instructorOneToManyRepository;

    @Autowired
    public InstructorOneToManyService(InstructorOneToManyRepository instructorOneToManyRepository) {
        this.instructorOneToManyRepository = instructorOneToManyRepository;
    }


    public List< InstructorOneToMany > findAll() {
        return null;
    }


    public InstructorOneToMany findById(Integer id) {
        return null;
    }


    public InstructorOneToMany persist(InstructorOneToMany instructorOneToMany) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorOneToMany > search(InstructorOneToMany instructorOneToMany) {
        return null;
    }
}
