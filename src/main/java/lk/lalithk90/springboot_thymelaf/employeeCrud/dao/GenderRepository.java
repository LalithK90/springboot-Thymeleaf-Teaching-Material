package lk.lalithk90.springboot_thymelaf.employeeCrud.dao;

import lk.lalithk90.springboot_thymelaf.employeeCrud.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository< Gender, Integer > {
}
