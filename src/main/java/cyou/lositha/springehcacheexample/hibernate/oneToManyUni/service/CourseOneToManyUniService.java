package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao.CourseOneToManyUniRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.CourseOneToManyUni;

@Service
public class CourseOneToManyUniService {
    private final CourseOneToManyUniRepository courseOneToManyUniRepository;

    public CourseOneToManyUniService(CourseOneToManyUniRepository courseOneToManyUniRepository) {
        this.courseOneToManyUniRepository = courseOneToManyUniRepository;
    }

    public List<CourseOneToManyUni> findAll() {
        return courseOneToManyUniRepository.findAll();
    }

    public CourseOneToManyUni findById(Integer id) {
        return null;
    }

    public CourseOneToManyUni persist(CourseOneToManyUni courseOneToManyUni) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<CourseOneToManyUni> search(CourseOneToManyUni courseOneToManyUni) {
        return null;
    }
}
