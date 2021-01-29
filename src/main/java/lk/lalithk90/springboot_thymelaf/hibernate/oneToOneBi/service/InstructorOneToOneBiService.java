package lk.lalithk90.springboot_thymelaf.hibernate.oneToOneBi.service;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToOneBi.dao.InstructorOneToOneBiRepository;
import lk.lalithk90.springboot_thymelaf.hibernate.oneToOneBi.entity.InstructorOneToOneBi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorOneToOneBiService {
    private final InstructorOneToOneBiRepository instructorOneToOneBiRepository;

    @Autowired
    public InstructorOneToOneBiService(InstructorOneToOneBiRepository instructorOneToOneBiRepository) {
        this.instructorOneToOneBiRepository = instructorOneToOneBiRepository;
    }


    public List< InstructorOneToOneBi > findAll() {
        return instructorOneToOneBiRepository.findAll();
    }


    public InstructorOneToOneBi findById(Integer id) {
        return instructorOneToOneBiRepository.getOne(id);
    }


    public InstructorOneToOneBi persist(InstructorOneToOneBi instructorOneToOneBi) {
        return instructorOneToOneBiRepository.save(instructorOneToOneBi);
    }


    public boolean delete(Integer id) {
        instructorOneToOneBiRepository.deleteById(id);
        return true;
    }


    public List< InstructorOneToOneBi > search(InstructorOneToOneBi instructorOneToOneBi) {
        return null;
    }
}
