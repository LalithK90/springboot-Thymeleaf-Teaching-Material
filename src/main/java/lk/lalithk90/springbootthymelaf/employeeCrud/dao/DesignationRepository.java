package lk.lalithk90.springbootthymelaf.employeeCrud.dao;

import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository< Designation, Integer > {
}
