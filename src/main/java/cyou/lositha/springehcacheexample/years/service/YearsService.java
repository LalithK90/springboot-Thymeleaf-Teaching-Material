package cyou.lositha.springehcacheexample.years.service;

import java.util.List;

import cyou.lositha.springehcacheexample.years.entity.Years;

public interface YearsService {

    List<Years> findAll();

    Years findById(Long id);

    Years persist(Years years);

    void delete(Long id);

    List<Years> search(Years years);

}
