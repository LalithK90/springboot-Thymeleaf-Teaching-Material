package lk.lalithk90.springbootthymelaf.employee.dao;

import lk.lalithk90.springbootthymelaf.employee.entity.CivilStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CivilStatusDao extends JpaRepository< CivilStatus, Integer > {
}
