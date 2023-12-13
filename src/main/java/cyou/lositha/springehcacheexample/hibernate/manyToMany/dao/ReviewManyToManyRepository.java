package cyou.lositha.springehcacheexample.hibernate.manyToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.ReviewManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewManyToManyRepository extends JpaRepository<ReviewManyToMany, Integer> {
}
