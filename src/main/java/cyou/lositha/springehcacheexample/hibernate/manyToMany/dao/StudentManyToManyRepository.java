package cyou.lositha.springehcacheexample.hibernate.manyToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.StudentManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentManyToManyRepository extends JpaRepository<StudentManyToMany, Integer> {
}
