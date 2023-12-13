package cyou.lositha.springehcacheexample.hibernate.manyToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.dao.InstructorDetailManyToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.InstructorDetailManyToMany;

@Service
public class InstructorDetailManyToManyService {
    private final InstructorDetailManyToManyRepository instructorDetailManyToManyRepository;

    public InstructorDetailManyToManyService(
            InstructorDetailManyToManyRepository instructorDetailManyToManyRepository) {
        this.instructorDetailManyToManyRepository = instructorDetailManyToManyRepository;
    }

    public List<InstructorDetailManyToMany> findAll() {
        return instructorDetailManyToManyRepository.findAll();
    }

    public InstructorDetailManyToMany findById(Integer id) {
        return null;
    }

    public InstructorDetailManyToMany persist(InstructorDetailManyToMany instructorDetailManyToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<InstructorDetailManyToMany> search(InstructorDetailManyToMany instructorDetailManyToMany) {
        return null;
    }
}
