package cyou.lositha.springehcacheexample.hibernate.oneToManyUni.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.hibernate.oneToManyUni.entity.InstructorOneToManyUni;

@Repository
public interface InstructorOneToManyUniRepository extends JpaRepository<InstructorOneToManyUni, Integer> {
}
