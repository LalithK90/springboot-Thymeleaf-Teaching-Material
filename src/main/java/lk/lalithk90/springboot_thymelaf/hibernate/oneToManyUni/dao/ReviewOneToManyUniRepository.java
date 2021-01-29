package lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.dao;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.entity.ReviewOneToManyUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewOneToManyUniRepository extends JpaRepository< ReviewOneToManyUni, Integer > {
}
