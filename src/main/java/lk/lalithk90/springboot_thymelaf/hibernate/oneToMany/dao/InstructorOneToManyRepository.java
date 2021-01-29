package lk.lalithk90.springboot_thymelaf.hibernate.oneToMany.dao;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToMany.entity.InstructorOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToManyRepository extends JpaRepository< InstructorOneToMany, Integer > {
}
