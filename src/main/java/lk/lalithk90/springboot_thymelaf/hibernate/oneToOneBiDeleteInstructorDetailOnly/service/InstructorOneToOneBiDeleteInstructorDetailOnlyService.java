package lk.lalithk90.springboot_thymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.service;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao.InstructorOneToOneBiDeleteInstructorDetailOnlyRepository;
import lk.lalithk90.springboot_thymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorOneToOneBiDeleteInstructorDetailOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorOneToOneBiDeleteInstructorDetailOnlyService  {
    private final InstructorOneToOneBiDeleteInstructorDetailOnlyRepository instructorOneToOneBiDeleteInstructorDetailOnlyRepository;

    @Autowired
    public InstructorOneToOneBiDeleteInstructorDetailOnlyService(InstructorOneToOneBiDeleteInstructorDetailOnlyRepository instructorOneToOneBiDeleteInstructorDetailOnlyRepository) {
        this.instructorOneToOneBiDeleteInstructorDetailOnlyRepository =
                instructorOneToOneBiDeleteInstructorDetailOnlyRepository;
    }


    public List< InstructorOneToOneBiDeleteInstructorDetailOnly > findAll() {
        return instructorOneToOneBiDeleteInstructorDetailOnlyRepository.findAll();
    }


    public InstructorOneToOneBiDeleteInstructorDetailOnly findById(Integer id) {
        return instructorOneToOneBiDeleteInstructorDetailOnlyRepository.getOne(id);
    }


    public InstructorOneToOneBiDeleteInstructorDetailOnly persist(InstructorOneToOneBiDeleteInstructorDetailOnly instructorOneToOneBiDeleteInstructorDetailOnly) {
        return instructorOneToOneBiDeleteInstructorDetailOnlyRepository.save(instructorOneToOneBiDeleteInstructorDetailOnly);
    }


    public boolean delete(Integer id) {
        instructorOneToOneBiDeleteInstructorDetailOnlyRepository.deleteById(id);
        return false;
    }


    public List< InstructorOneToOneBiDeleteInstructorDetailOnly > search(InstructorOneToOneBiDeleteInstructorDetailOnly instructorOneToOneBiDeleteInstructorDetailOnly) {
        return null;
    }
}
