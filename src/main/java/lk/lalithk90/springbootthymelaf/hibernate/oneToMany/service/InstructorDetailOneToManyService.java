package lk.lalithk90.springbootthymelaf.hibernate.oneToMany.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToMany.dao.InstructorDetailOneToManyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToMany.entity.InstructorDetailOneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailOneToManyService  {
    private final InstructorDetailOneToManyRepository instructorDetailOneToManyRepository;

    @Autowired
    public InstructorDetailOneToManyService(InstructorDetailOneToManyRepository instructorDetailOneToManyRepository) {
        this.instructorDetailOneToManyRepository = instructorDetailOneToManyRepository;
    }


    public List< InstructorDetailOneToMany > findAll() {
        return null;
    }


    public InstructorDetailOneToMany findById(Integer id) {
        return null;
    }


    public InstructorDetailOneToMany persist(InstructorDetailOneToMany instructorDetailOneToMany) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorDetailOneToMany > search(InstructorDetailOneToMany instructorDetailOneToMany) {
        return null;
    }
}
