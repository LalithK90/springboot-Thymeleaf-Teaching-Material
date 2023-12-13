package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao.InstructorOneToManyUniRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.InstructorOneToManyUni;

@Service
public class InstructorOneToManyUniService {
    private final InstructorOneToManyUniRepository instructorOneToManyUniRepository;

    public InstructorOneToManyUniService(InstructorOneToManyUniRepository instructorOneToManyUniRepository) {
        this.instructorOneToManyUniRepository = instructorOneToManyUniRepository;
    }

    public List<InstructorOneToManyUni> findAll() {
        return instructorOneToManyUniRepository.findAll();
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

    public List<InstructorOneToManyUni> search(InstructorOneToManyUni instructorOneToManyUni) {
        return null;
    }
}
