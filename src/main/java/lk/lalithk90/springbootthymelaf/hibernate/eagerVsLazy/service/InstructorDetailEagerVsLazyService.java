package lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.dao.InstructorDetailEagerVsLazyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.eagerVsLazy.entity.InstructorDetailEagerVsLazy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailEagerVsLazyService {
    private final InstructorDetailEagerVsLazyRepository instructorDetailEagerVsLazyRepository;

    @Autowired
    public InstructorDetailEagerVsLazyService(InstructorDetailEagerVsLazyRepository instructorDetailEagerVsLazyRepository) {
        this.instructorDetailEagerVsLazyRepository = instructorDetailEagerVsLazyRepository;
    }


    public List< InstructorDetailEagerVsLazy > findAll() {
        return null;
    }


    public InstructorDetailEagerVsLazy findById(Integer id) {
        return null;
    }


    public InstructorDetailEagerVsLazy persist(InstructorDetailEagerVsLazy instructorDetailEagerVsLazy) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< InstructorDetailEagerVsLazy > search(InstructorDetailEagerVsLazy instructorDetailEagerVsLazy) {
        return null;
    }
}
