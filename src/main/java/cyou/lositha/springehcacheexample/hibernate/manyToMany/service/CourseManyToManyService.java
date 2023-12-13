package cyou.lositha.springehcacheexample.hibernate.manyToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.dao.CourseManyToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.CourseManyToMany;

@Service
public class CourseManyToManyService {
    private final CourseManyToManyRepository courseManyToManyRepository;

    public CourseManyToManyService(CourseManyToManyRepository courseManyToManyRepository) {
        this.courseManyToManyRepository = courseManyToManyRepository;
    }

    public List<CourseManyToMany> findAll() {
        return courseManyToManyRepository.findAll();
    }

    public CourseManyToMany findById(Integer id) {
        return null;
    }

    public CourseManyToMany persist(CourseManyToMany courseManyToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<CourseManyToMany> search(CourseManyToMany courseManyToMany) {
        return null;
    }
}
