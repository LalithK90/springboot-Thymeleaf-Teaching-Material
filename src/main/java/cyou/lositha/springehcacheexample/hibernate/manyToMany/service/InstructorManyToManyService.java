package cyou.lositha.springehcacheexample.hibernate.manyToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.dao.InstructorManyToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.InstructorManyToMany;

@Service
public class InstructorManyToManyService {
    private final InstructorManyToManyRepository instructorManyToManyRepository;

    public InstructorManyToManyService(InstructorManyToManyRepository instructorManyToManyRepository) {
        this.instructorManyToManyRepository = instructorManyToManyRepository;
    }

    public List<InstructorManyToMany> findAll() {
        return instructorManyToManyRepository.findAll();
    }

    public InstructorManyToMany findById(Integer id) {
        return null;
    }

    public InstructorManyToMany persist(InstructorManyToMany instructorManyToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<InstructorManyToMany> search(InstructorManyToMany instructorManyToMany) {
        return null;
    }
}
