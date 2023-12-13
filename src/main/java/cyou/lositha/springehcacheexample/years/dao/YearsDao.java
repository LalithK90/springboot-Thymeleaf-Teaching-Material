package cyou.lositha.springehcacheexample.years.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cyou.lositha.springehcacheexample.years.entity.Years;

public interface YearsDao extends JpaRepository<Years, Long> {

}
