package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.ReviewOneToManyUni;

@Repository
public interface ReviewOneToManyUniRepository extends JpaRepository<ReviewOneToManyUni, Integer> {
}
