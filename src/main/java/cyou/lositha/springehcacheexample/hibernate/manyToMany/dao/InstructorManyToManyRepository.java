package cyou.lositha.springehcacheexample.hibernate.manyToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.InstructorManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorManyToManyRepository extends JpaRepository<InstructorManyToMany, Integer> {
}
