package cyou.lositha.springehcacheexample.employeeCrud.dao;

import cyou.lositha.springehcacheexample.employeeCrud.entity.WeekDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekDayRepository extends JpaRepository<WeekDay, Integer> {
}
