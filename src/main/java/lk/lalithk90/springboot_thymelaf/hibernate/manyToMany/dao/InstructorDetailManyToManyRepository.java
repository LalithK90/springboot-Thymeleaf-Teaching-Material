package lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.dao;

import lk.lalithk90.springboot_thymelaf.hibernate.manyToMany.entity.InstructorDetailManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailManyToManyRepository extends JpaRepository< InstructorDetailManyToMany, Integer > {
}
