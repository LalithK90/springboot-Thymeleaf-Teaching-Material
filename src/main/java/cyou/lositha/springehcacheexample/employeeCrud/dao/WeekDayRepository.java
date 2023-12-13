package cyou.lositha.springehcacheexample.employeeCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cyou.lositha.springehcacheexample.employeeCrud.entity.WeekDay;

@Repository
public interface WeekDayRepository extends JpaRepository<WeekDay, Long> {
}
