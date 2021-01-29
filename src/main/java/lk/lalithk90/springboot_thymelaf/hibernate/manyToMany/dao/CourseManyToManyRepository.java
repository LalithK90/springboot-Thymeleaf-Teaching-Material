package lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.dao;

import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.entity.CourseManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseManyToManyRepository extends JpaRepository< CourseManyToMany, Integer > {
}
