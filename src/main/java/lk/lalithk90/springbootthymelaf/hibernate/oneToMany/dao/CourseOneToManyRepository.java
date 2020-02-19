package lk.lalithk90.springbootthymelaf.hibernate.oneToMany.dao;

import lk.lalithk90.springbootthymelaf.hibernate.oneToMany.entity.CourseOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseOneToManyRepository extends JpaRepository< CourseOneToMany, Integer > {
}
