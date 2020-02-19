package lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.service;

import lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.dao.InstructorOneToOneUniRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.entity.InstructorOneToOneUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorOneToOneUniService  {
    private final InstructorOneToOneUniRepository instructorOneToOneUniRepository;

    @Autowired
    public InstructorOneToOneUniService(InstructorOneToOneUniRepository instructorOneToOneUniRepository) {
        this.instructorOneToOneUniRepository = instructorOneToOneUniRepository;
    }


    public List< InstructorOneToOneUni > findAll() {
        return instructorOneToOneUniRepository.findAll();
    }


    public InstructorOneToOneUni findById(Integer id) {
        return instructorOneToOneUniRepository.getOne(id);
    }


    public InstructorOneToOneUni persist(InstructorOneToOneUni instructorOneToOneUni) {
        return instructorOneToOneUniRepository.save(instructorOneToOneUni);
    }


    public boolean delete(Integer id) {
       instructorOneToOneUniRepository.deleteById(id);
       return true;
    }


    public List< InstructorOneToOneUni > search(InstructorOneToOneUni instructorOneToOneUni) {
        return null;
    }
}
