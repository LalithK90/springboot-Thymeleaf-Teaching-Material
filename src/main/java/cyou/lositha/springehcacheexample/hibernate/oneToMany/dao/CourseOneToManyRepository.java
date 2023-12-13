package cyou.lositha.springehcacheexample.hibernate.oneToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToMany.entity.CourseOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseOneToManyRepository extends JpaRepository<CourseOneToMany, Integer> {
}
