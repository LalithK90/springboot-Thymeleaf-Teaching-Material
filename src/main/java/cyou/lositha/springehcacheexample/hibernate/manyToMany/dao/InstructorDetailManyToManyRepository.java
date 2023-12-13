package cyou.lositha.springehcacheexample.hibernate.manyToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.InstructorDetailManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailManyToManyRepository extends JpaRepository<InstructorDetailManyToMany, Integer> {
}
