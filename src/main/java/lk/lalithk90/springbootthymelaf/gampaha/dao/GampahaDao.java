package lk.lalithk90.springbootthymelaf.gampaha.dao;

import lk.lalithk90.springbootthymelaf.gampaha.entity.Gampaha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GampahaDao extends JpaRepository<Gampaha,Integer> {

}
