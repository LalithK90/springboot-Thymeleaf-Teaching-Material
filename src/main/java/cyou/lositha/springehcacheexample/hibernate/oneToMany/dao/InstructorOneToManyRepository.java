package cyou.lositha.springehcacheexample.hibernate.oneToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToMany.entity.InstructorOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorOneToManyRepository extends JpaRepository<InstructorOneToMany, Integer> {
}
