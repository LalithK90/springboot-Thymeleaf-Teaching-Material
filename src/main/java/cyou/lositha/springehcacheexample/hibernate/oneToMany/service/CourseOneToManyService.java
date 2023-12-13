package cyou.lositha.springehcacheexample.hibernate.oneToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToMany.dao.CourseOneToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToMany.entity.CourseOneToMany;

@Service
public class CourseOneToManyService {
    private final CourseOneToManyRepository courseOneToManyRepository;

    public CourseOneToManyService(CourseOneToManyRepository courseOneToManyRepository) {
        this.courseOneToManyRepository = courseOneToManyRepository;
    }

    public List<CourseOneToMany> findAll() {
        return courseOneToManyRepository.findAll();
    }

    public CourseOneToMany findById(Integer id) {
        return null;
    }

    public CourseOneToMany persist(CourseOneToMany courseOneToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<CourseOneToMany> search(CourseOneToMany courseOneToMany) {
        return null;
    }
}
