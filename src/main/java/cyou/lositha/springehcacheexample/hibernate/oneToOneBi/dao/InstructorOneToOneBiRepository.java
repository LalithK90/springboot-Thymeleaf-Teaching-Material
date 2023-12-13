package cyou.lositha.springehcacheexample.hibernate.oneToOneBi.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToOneBi.entity.InstructorOneToOneBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToOneBiRepository extends JpaRepository<InstructorOneToOneBi, Integer> {
}
