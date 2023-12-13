package cyou.lositha.springehcacheexample.hibernate.manyToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.CourseManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseManyToManyRepository extends JpaRepository<CourseManyToMany, Integer> {
}
