package cyou.lositha.springehcacheexample.pagination_example.dao;

import cyou.lositha.springehcacheexample.pagination_example.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
