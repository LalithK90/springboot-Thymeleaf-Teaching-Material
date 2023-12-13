package cyou.lositha.springehcacheexample.hibernate.oneToMany.dao;

import cyou.lositha.springehcacheexample.hibernate.oneToMany.entity.InstructorDetailOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailOneToManyRepository extends JpaRepository<InstructorDetailOneToMany, Integer> {
}
