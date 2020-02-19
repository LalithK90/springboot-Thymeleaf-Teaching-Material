package lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.dao.CourseOneToManyUniRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.entity.CourseOneToManyUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOneToManyUniService {
    private final CourseOneToManyUniRepository courseOneToManyUniRepository;

    @Autowired
    public CourseOneToManyUniService(CourseOneToManyUniRepository courseOneToManyUniRepository) {
        this.courseOneToManyUniRepository = courseOneToManyUniRepository;
    }


    public List< CourseOneToManyUni > findAll() {
        return null;
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


    public List< CourseOneToManyUni > search(CourseOneToManyUni courseOneToManyUni) {
        return null;
    }
}
