package lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.dao;

import lk.lalithk90.springbootthymelaf.hibernate.oneToOneUni.entity.InstructorOneToOneUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToOneUniRepository extends JpaRepository< InstructorOneToOneUni, Integer > {
}
