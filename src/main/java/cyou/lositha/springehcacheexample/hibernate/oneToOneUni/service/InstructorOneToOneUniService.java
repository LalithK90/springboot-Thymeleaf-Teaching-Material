package cyou.lositha.springehcacheexample.hibernate.oneToOneUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToOneUni.dao.InstructorOneToOneUniRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToOneUni.entity.InstructorOneToOneUni;

@Service
public class InstructorOneToOneUniService {
    private final InstructorOneToOneUniRepository instructorOneToOneUniRepository;

    public InstructorOneToOneUniService(InstructorOneToOneUniRepository instructorOneToOneUniRepository) {
        this.instructorOneToOneUniRepository = instructorOneToOneUniRepository;
    }

    public List<InstructorOneToOneUni> findAll() {
        return instructorOneToOneUniRepository.findAll();
    }

    public InstructorOneToOneUni findById(Integer id) {
        return instructorOneToOneUniRepository.getReferenceById(id);
    }

    public InstructorOneToOneUni persist(InstructorOneToOneUni instructorOneToOneUni) {
        return instructorOneToOneUniRepository.save(instructorOneToOneUni);
    }

    public boolean delete(Integer id) {
        instructorOneToOneUniRepository.deleteById(id);
        return true;
    }

    public List<InstructorOneToOneUni> search(InstructorOneToOneUni instructorOneToOneUni) {
        return null;
    }
}
