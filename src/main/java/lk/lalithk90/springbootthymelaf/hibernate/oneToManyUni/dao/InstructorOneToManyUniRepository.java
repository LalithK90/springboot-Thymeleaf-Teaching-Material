package lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.dao;

import lk.lalithk90.springbootthymelaf.hibernate.oneToManyUni.entity.InstructorOneToManyUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToManyUniRepository extends JpaRepository< InstructorOneToManyUni, Integer > {
}
