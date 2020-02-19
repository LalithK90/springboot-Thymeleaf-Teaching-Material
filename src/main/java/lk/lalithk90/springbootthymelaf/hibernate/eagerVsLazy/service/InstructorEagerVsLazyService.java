package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.dao.InstructorEagerVsLazyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.InstructorEagerVsLazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorEagerVsLazyService {
    private final InstructorEagerVsLazyRepository instructorEagerVsLazyRepository;

    @Autowired
    public InstructorEagerVsLazyService(InstructorEagerVsLazyRepository instructorEagerVsLazyRepository) {
        this.instructorEagerVsLazyRepository = instructorEagerVsLazyRepository;
    }


    public List< InstructorEagerVsLazy > findAll() {
        return null;
    }


    public InstructorEagerVsLazy findById(Integer id) {
        return null;
    }


    public InstructorEagerVsLazy persist(InstructorEagerVsLazy instructorEagerVsLazy) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorEagerVsLazy > search(InstructorEagerVsLazy instructorEagerVsLazy) {
        return null;
    }
}
