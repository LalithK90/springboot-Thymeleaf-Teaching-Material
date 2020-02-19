package lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.dao.InstructorOneToManyUniRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.entity.InstructorOneToManyUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorOneToManyUniService  {
    private final InstructorOneToManyUniRepository instructorOneToManyUniRepository;

    @Autowired
    public InstructorOneToManyUniService(InstructorOneToManyUniRepository instructorOneToManyUniRepository) {
        this.instructorOneToManyUniRepository = instructorOneToManyUniRepository;
    }


    public List< InstructorOneToManyUni > findAll() {
        return null;
    }


    public InstructorOneToManyUni findById(Integer id) {
        return null;
    }


    public InstructorOneToManyUni persist(InstructorOneToManyUni instructorOneToManyUni) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorOneToManyUni > search(InstructorOneToManyUni instructorOneToManyUni) {
        return null;
    }
}
