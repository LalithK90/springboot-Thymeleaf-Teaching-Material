package lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.dao.InstructorDetailOneToManyUniRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.entity.InstructorDetailOneToManyUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailOneToManyUniService {
    private final InstructorDetailOneToManyUniRepository instructorDetailOneToManyUniRepository;

    @Autowired
    public InstructorDetailOneToManyUniService(InstructorDetailOneToManyUniRepository instructorDetailOneToManyUniRepository) {
        this.instructorDetailOneToManyUniRepository = instructorDetailOneToManyUniRepository;
    }


    public List< InstructorDetailOneToManyUni > findAll() {
        return null;
    }


    public InstructorDetailOneToManyUni findById(Integer id) {
        return null;
    }


    public InstructorDetailOneToManyUni persist(InstructorDetailOneToManyUni instructorDetailOneToManyUni) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorDetailOneToManyUni > search(InstructorDetailOneToManyUni instructorDetailOneToManyUni) {
        return null;
    }
}
