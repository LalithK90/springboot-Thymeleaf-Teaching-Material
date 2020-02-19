package lk.lalithk90.springbootthymelaf.hibernate.oneToMany.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToMany.dao.CourseOneToManyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToMany.entity.CourseOneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOneToManyService {
    private final CourseOneToManyRepository courseOneToManyRepository;

    @Autowired
    public CourseOneToManyService(CourseOneToManyRepository courseOneToManyRepository) {
        this.courseOneToManyRepository = courseOneToManyRepository;
    }


    public List< CourseOneToMany > findAll() {
        return null;
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


    public List< CourseOneToMany > search(CourseOneToMany courseOneToMany) {
        return null;
    }
}
