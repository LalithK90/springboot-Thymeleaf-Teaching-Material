package cyou.lositha.springehcacheexample.employeeCrud.dao;

import cyou.lositha.springehcacheexample.employeeCrud.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Integer> {
}
