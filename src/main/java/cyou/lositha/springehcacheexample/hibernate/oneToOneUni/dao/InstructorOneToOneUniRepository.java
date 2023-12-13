package cyou.lositha.springehcacheexample.hibernate.oneToOneUni.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToOneUni.entity.InstructorOneToOneUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToOneUniRepository extends JpaRepository<InstructorOneToOneUni, Integer> {
}
