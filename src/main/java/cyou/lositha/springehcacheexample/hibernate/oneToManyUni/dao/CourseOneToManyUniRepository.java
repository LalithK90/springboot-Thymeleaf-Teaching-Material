package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.CourseOneToManyUni;

@Repository
public interface CourseOneToManyUniRepository extends JpaRepository<CourseOneToManyUni, Integer> {
}
