package cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao.InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorDetailOneToOneBiDeleteInstructorDetailOnly;

@Service
public class InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService {
    private final InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository;

    public InstructorDetailOneToOneBiDeleteInstructorDetailOnlyService(
            InstructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository) {
        this.instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository = instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository;
    }

    public List<InstructorDetailOneToOneBiDeleteInstructorDetailOnly> findAll() {
        return instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.findAll();
    }

    public InstructorDetailOneToOneBiDeleteInstructorDetailOnly findById(int id) {
        return instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.getReferenceById(id);
    }

    public InstructorDetailOneToOneBiDeleteInstructorDetailOnly persist(
            InstructorDetailOneToOneBiDeleteInstructorDetailOnly instructorDetailOneToOneBiDeleteInstructorDetailOnly) {
        return instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository
                .save(instructorDetailOneToOneBiDeleteInstructorDetailOnly);
    }

    public boolean delete(int id) {
        instructorDetailOneToOneBiDeleteInstructorDetailOnlyRepository.deleteById(id);
        return true;
    }

    public List<InstructorDetailOneToOneBiDeleteInstructorDetailOnly> search(
            InstructorDetailOneToOneBiDeleteInstructorDetailOnly instructorDetailOneToOneBiDeleteInstructorDetailOnly) {
        return null;
    }
}
