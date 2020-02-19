package lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.dao;

import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBi.entity.InstructorOneToOneBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToOneBiRepository extends JpaRepository< InstructorOneToOneBi, Integer > {
}
