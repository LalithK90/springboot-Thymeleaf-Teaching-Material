package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.dao.CourseEagerVsLazyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.CourseEagerVsLazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseEagerVsLazyService {
    private final CourseEagerVsLazyRepository courseEagerVsLazyRepository;

    @Autowired
    public CourseEagerVsLazyService(CourseEagerVsLazyRepository courseEagerVsLazyRepository) {
        this.courseEagerVsLazyRepository = courseEagerVsLazyRepository;
    }


    public List< CourseEagerVsLazy > findAll() {
        return null;
    }


    public CourseEagerVsLazy findById(Integer id) {
        return null;
    }


    public CourseEagerVsLazy persist(CourseEagerVsLazy courseEagerVsLazy) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< CourseEagerVsLazy > search(CourseEagerVsLazy courseEagerVsLazy) {
        return null;
    }
}
