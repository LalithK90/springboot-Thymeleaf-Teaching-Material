package lk.lalithk90.springboot_thymelaf.final_class.person.dao;

import lk.lalithk90.springboot_thymelaf.final_class.person.entity.PersonFinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonFinalDao extends JpaRepository< PersonFinal, Integer > {
}
