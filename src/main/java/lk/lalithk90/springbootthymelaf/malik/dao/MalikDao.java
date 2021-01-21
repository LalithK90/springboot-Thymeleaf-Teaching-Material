package lk.lalithk90.springbootthymelaf.malik.dao;

import lk.lalithk90.springbootthymelaf.malik.entity.Malik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MalikDao extends JpaRepository<Malik, Integer> {
}
//class class  -> extend
//class interface - > implement
//interface interface -> extend