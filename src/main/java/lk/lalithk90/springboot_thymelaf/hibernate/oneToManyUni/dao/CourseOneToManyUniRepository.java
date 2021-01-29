package lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.dao;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.entity.CourseOneToManyUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseOneToManyUniRepository extends JpaRepository< CourseOneToManyUni, Integer > {
}
