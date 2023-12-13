package cyou.lositha.springehcacheexample.employeeCrud.dao;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Hobbies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbiesRepository extends JpaRepository<Hobbies, Integer> {
}
