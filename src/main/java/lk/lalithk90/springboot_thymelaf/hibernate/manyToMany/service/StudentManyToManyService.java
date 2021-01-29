package lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.service;

import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.dao.StudentManyToManyRepository;
import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.entity.StudentManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManyToManyService {
    private final StudentManyToManyRepository studentManyToManyRepository;

    @Autowired
    public StudentManyToManyService(StudentManyToManyRepository studentManyToManyRepository) {
        this.studentManyToManyRepository = studentManyToManyRepository;
    }


    public List< StudentManyToMany > findAll() {
        return null;
    }


    public StudentManyToMany findById(Integer id) {
        return null;
    }


    public StudentManyToMany persist(StudentManyToMany studentManyToMany) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< StudentManyToMany > search(StudentManyToMany studentManyToMany) {
        return null;
    }
}
