package lk.lalithk90.springbootthymelaf.hibernate.manyToMany.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.manyToMany.dao.ReviewManyToManyRepository;
import lk.lalithk90.springbootthymelaf.hibernate.manyToMany.entity.ReviewManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewManyToManyService {
    private final ReviewManyToManyRepository reviewManyToManyRepository;

    @Autowired
    public ReviewManyToManyService(ReviewManyToManyRepository reviewManyToManyRepository) {
        this.reviewManyToManyRepository = reviewManyToManyRepository;
    }


    public List< ReviewManyToMany > findAll() {
        return null;
    }


    public ReviewManyToMany findById(Integer id) {
        return null;
    }


    public ReviewManyToMany persist(ReviewManyToMany reviewManyToMany) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List< ReviewManyToMany > search(ReviewManyToMany reviewManyToMany) {
        return null;
    }
}
