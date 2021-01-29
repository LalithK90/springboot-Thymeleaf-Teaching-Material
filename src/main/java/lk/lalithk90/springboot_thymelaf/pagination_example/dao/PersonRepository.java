package lk.lalithk90.springboot_thymelaf.pagination_example.dao;


import lk.lalithk90.springboot_thymelaf.pagination_example.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository< Person, Long> {

}
