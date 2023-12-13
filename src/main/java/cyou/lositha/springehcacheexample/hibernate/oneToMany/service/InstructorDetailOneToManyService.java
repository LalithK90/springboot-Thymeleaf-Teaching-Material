package cyou.lositha.springehcacheexample.hibernate.oneToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToMany.dao.InstructorDetailOneToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToMany.entity.InstructorDetailOneToMany;

@Service
public class InstructorDetailOneToManyService {
    private final InstructorDetailOneToManyRepository instructorDetailOneToManyRepository;

    public InstructorDetailOneToManyService(InstructorDetailOneToManyRepository instructorDetailOneToManyRepository) {
        this.instructorDetailOneToManyRepository = instructorDetailOneToManyRepository;
    }

    public List<InstructorDetailOneToMany> findAll() {
        return instructorDetailOneToManyRepository.findAll();
    }

    public InstructorDetailOneToMany findById(Integer id) {
        return null;
    }

    public InstructorDetailOneToMany persist(InstructorDetailOneToMany instructorDetailOneToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<InstructorDetailOneToMany> search(InstructorDetailOneToMany instructorDetailOneToMany) {
        return null;
    }
}
