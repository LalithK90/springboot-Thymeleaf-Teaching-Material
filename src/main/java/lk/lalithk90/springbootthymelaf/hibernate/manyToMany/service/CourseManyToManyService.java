package lk.lalithk90.springbootthymelaf.hibernate.manyToMany.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.manyToMany.dao.CourseManyToManyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.manyToMany.entity.CourseManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseManyToManyService {
    private final CourseManyToManyRepository courseManyToManyRepository;

    @Autowired
    public CourseManyToManyService(CourseManyToManyRepository courseManyToManyRepository) {
        this.courseManyToManyRepository = courseManyToManyRepository;
    }


    public List< CourseManyToMany > findAll() {
        return null;
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


    public List< CourseManyToMany > search(CourseManyToMany courseManyToMany) {
        return null;
    }
}
