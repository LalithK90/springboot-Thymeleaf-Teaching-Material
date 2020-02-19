package lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao.InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorDetailOneToOneBiDeleteInstructorDetailOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService {
    private final InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository;

    @Autowired
    public InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService(InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository) {
        this.instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository =
                instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository;
    }


    public List< InstructorDetailOneToOneBiDeleteInstructorDetailOnly > findAll() {
        return instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.findAll();
    }


    public InstructorDetailOneToOneBiDeleteInstructorDetailOnly findById(int id) {
        return instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.getOne(id);
    }


    public InstructorDetailOneToOneBiDeleteInstructorDetailOnly persist(InstructorDetailOneToOneBiDeleteInstructorDetailOnly instructorDetailOneToOneBiDeleteInstructorDetailOnly) {
        return instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.save(instructorDetailOneToOneBiDeleteInstructorDetailOnly);
    }


    public boolean delete(int id) {
        instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.deleteById(id);
        return true;
    }


    public List< InstructorDetailOneToOneBiDeleteInstructorDetailOnly > search(InstructorDetailOneToOneBiDeleteInstructorDetailOnly instructorDetailOneToOneBiDeleteInstructorDetailOnly) {
        return null;
    }
}
