package lk.lalithk90.springbootthymelaf.kokis.dao;

import lk.lalithk90.springbootthymelaf.kokis.entity.Mixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MixtureDao extends JpaRepository<Mixture, Integer> {

}
