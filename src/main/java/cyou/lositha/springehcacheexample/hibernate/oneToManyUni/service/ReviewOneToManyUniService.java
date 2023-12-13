package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao.ReviewOneToManyUniRepository;
import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.ReviewOneToManyUni;

@Service
public class ReviewOneToManyUniService {
    private final ReviewOneToManyUniRepository reviewOneToManyUniRepository;

    public ReviewOneToManyUniService(ReviewOneToManyUniRepository reviewOneToManyUniRepository) {
        this.reviewOneToManyUniRepository = reviewOneToManyUniRepository;
    }

    public List<ReviewOneToManyUni> findAll() {
        return reviewOneToManyUniRepository.findAll();
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

    public List<ReviewOneToManyUni> search(ReviewOneToManyUni reviewOneToManyUni) {
        return null;
    }
}
