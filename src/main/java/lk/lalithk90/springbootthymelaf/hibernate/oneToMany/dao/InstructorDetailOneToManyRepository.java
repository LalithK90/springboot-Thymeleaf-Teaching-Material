package lk.lalithk90.springbootthymelaf.hibernate.oneToMany.dao;

import lk.lalithk90.springbootthymelaf.hibernate.oneToMany.entity.InstructorDetailOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailOneToManyRepository extends JpaRepository< InstructorDetailOneToMany, Integer > {
}
