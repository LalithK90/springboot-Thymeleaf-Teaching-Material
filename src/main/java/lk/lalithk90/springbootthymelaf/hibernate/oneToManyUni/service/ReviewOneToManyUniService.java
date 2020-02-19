package lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.dao.ReviewOneToManyUniRepository;
import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.entity.ReviewOneToManyUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewOneToManyUniService  {
    private final ReviewOneToManyUniRepository reviewOneToManyUniRepository;

    @Autowired
    public ReviewOneToManyUniService(ReviewOneToManyUniRepository reviewOneToManyUniRepository) {
        this.reviewOneToManyUniRepository = reviewOneToManyUniRepository;
    }



    public List< ReviewOneToManyUni > findAll() {
        return null;
    }



    public ReviewOneToManyUni findById(Integer id) {
        return null;
    }



    public ReviewOneToManyUni persist(ReviewOneToManyUni reviewOneToManyUni) {
        return null;
    }



    public boolean delete(Integer id) {
        return false;
    }



    public List< ReviewOneToManyUni > search(ReviewOneToManyUni reviewOneToManyUni) {
        return null;
    }
}
