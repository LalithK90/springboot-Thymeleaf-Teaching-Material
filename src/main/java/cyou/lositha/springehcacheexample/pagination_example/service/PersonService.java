package cyou.lositha.springehcacheexample.pagination_example.service;

import cyou.lositha.springehcacheexample.pagination_example.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

    /**
     * Finds a "page" of persons
     *
     * @param pageable
     * @return {@link Page} instance
     */
    Page<Person> findAllPageable(Pageable pageable);
}
