package cyou.lositha.springehcacheexample.hibernate.oneToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToMany.dao.InstructorOneToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToMany.entity.InstructorOneToMany;

@Service
public class InstructorOneToManyService {
    private final InstructorOneToManyRepository instructorOneToManyRepository;

    public InstructorOneToManyService(InstructorOneToManyRepository instructorOneToManyRepository) {
        this.instructorOneToManyRepository = instructorOneToManyRepository;
    }

    public List<InstructorOneToMany> findAll() {
        return instructorOneToManyRepository.findAll();
    }

    public InstructorOneToMany findById(Integer id) {
        return null;
    }

    public InstructorOneToMany persist(InstructorOneToMany instructorOneToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<InstructorOneToMany> search(InstructorOneToMany instructorOneToMany) {
        return null;
    }
}
