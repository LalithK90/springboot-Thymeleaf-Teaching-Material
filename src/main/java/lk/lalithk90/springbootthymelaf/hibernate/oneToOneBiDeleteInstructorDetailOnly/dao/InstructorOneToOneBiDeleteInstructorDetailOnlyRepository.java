package lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.dao;

import lk.lalithk90.springbootthymelaf.hibernate.oneToOneBiDeleteInstructorDetailOnly.entity.InstructorOneToOneBiDeleteInstructorDetailOnly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToOneBiDeleteInstructorDetailOnlyRepository extends JpaRepository< InstructorOneToOneBiDeleteInstructorDetailOnly, Integer > {
}
