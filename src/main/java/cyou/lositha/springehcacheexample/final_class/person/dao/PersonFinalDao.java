package cyou.lositha.springehcacheexample.final_class.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.final_class.person.entity.PersonFinal;

@Repository
public interface PersonFinalDao extends JpaRepository<PersonFinal, Integer> {
}
