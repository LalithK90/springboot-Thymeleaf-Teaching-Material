package cyou.lositha.springehcacheexample.hibernate.manyToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.dao.ReviewManyToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.ReviewManyToMany;

@Service
public class ReviewManyToManyService {
    private final ReviewManyToManyRepository reviewManyToManyRepository;

    public ReviewManyToManyService(ReviewManyToManyRepository reviewManyToManyRepository) {
        this.reviewManyToManyRepository = reviewManyToManyRepository;
    }

    public List<ReviewManyToMany> findAll() {
        return reviewManyToManyRepository.findAll();
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

    public List<ReviewManyToMany> search(ReviewManyToMany reviewManyToMany) {
        return null;
    }
}
