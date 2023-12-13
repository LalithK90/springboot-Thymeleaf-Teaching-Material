package cyou.lositha.springehcacheexample.hibernate.oneToOneBi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToOneBi.dao.InstructorOneToOneBiRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToOneBi.entity.InstructorOneToOneBi;

@Service
public class InstructorOneToOneBiService {
    private final InstructorOneToOneBiRepository instructorOneToOneBiRepository;

    public InstructorOneToOneBiService(InstructorOneToOneBiRepository instructorOneToOneBiRepository) {
        this.instructorOneToOneBiRepository = instructorOneToOneBiRepository;
    }

    public List<InstructorOneToOneBi> findAll() {
        return instructorOneToOneBiRepository.findAll();
    }

    public InstructorOneToOneBi findById(Integer id) {
        return instructorOneToOneBiRepository.getReferenceById(id);
    }

    public InstructorOneToOneBi persist(InstructorOneToOneBi instructorOneToOneBi) {
        return instructorOneToOneBiRepository.save(instructorOneToOneBi);
    }

    public boolean delete(Integer id) {
        instructorOneToOneBiRepository.deleteById(id);
        return true;
    }

    public List<InstructorOneToOneBi> search(InstructorOneToOneBi instructorOneToOneBi) {
        return null;
    }
}
