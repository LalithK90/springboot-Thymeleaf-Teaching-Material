package cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao.InstructorOneToOneBiDeleteInstructorDetailOnlyRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorOneToOneBiDeleteInstructorDetailOnly;

@Service
public class InstructorOneToOneBiDeleteInstructorDetailOnlyService {
    private final InstructorOneToOneBiDeleteInstructorDetailOnlyRepository instructorOneToOneBiDeleteInstructorDetailOnlyRepository;

    public InstructorOneToOneBiDeleteInstructorDetailOnlyService(
            InstructorOneToOneBiDeleteInstructorDetailOnlyRepository instructorOneToOneBiDeleteInstructorDetailOnlyRepository) {
        this.instructorOneToOneBiDeleteInstructorDetailOnlyRepository = instructorOneToOneBiDeleteInstructorDetailOnlyRepository;
    }

    public List<InstructorOneToOneBiDeleteInstructorDetailOnly> findAll() {
        return instructorOneToOneBiDeleteInstructorDetailOnlyRepository.findAll();
    }

    public InstructorOneToOneBiDeleteInstructorDetailOnly findById(Integer id) {
        return instructorOneToOneBiDeleteInstructorDetailOnlyRepository.getReferenceById(id);
    }

    public InstructorOneToOneBiDeleteInstructorDetailOnly persist(
            InstructorOneToOneBiDeleteInstructorDetailOnly instructorOneToOneBiDeleteInstructorDetailOnly) {
        return instructorOneToOneBiDeleteInstructorDetailOnlyRepository
                .save(instructorOneToOneBiDeleteInstructorDetailOnly);
    }

    public boolean delete(Integer id) {
        instructorOneToOneBiDeleteInstructorDetailOnlyRepository.deleteById(id);
        return false;
    }

    public List<InstructorOneToOneBiDeleteInstructorDetailOnly> search(
            InstructorOneToOneBiDeleteInstructorDetailOnly instructorOneToOneBiDeleteInstructorDetailOnly) {
        return null;
    }
}
