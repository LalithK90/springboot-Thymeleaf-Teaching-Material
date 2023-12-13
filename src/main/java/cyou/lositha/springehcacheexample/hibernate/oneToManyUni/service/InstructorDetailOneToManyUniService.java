package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao.InstructorDetailOneToManyUniRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.InstructorDetailOneToManyUni;

@Service
public class InstructorDetailOneToManyUniService {
    private final InstructorDetailOneToManyUniRepository instructorDetailOneToManyUniRepository;

    public InstructorDetailOneToManyUniService(
            InstructorDetailOneToManyUniRepository instructorDetailOneToManyUniRepository) {
        this.instructorDetailOneToManyUniRepository = instructorDetailOneToManyUniRepository;
    }

    public List<InstructorDetailOneToManyUni> findAll() {
        return instructorDetailOneToManyUniRepository.findAll();
    }

    public InstructorDetailOneToManyUni findById(Integer id) {
        return null;
    }

    public InstructorDetailOneToManyUni persist(InstructorDetailOneToManyUni instructorDetailOneToManyUni) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<InstructorDetailOneToManyUni> search(InstructorDetailOneToManyUni instructorDetailOneToManyUni) {
        return null;
    }
}
