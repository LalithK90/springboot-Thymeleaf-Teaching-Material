package lk.lalithk90.springboot_thymelaf.pagination_example.service.impl;


import lk.lalithk90.springboot_thymelaf.pagination_example.entity.Person;
import lk.lalithk90.springboot_thymelaf.pagination_example.dao.PersonRepository;
import lk.lalithk90.springboot_thymelaf.pagination_example.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Page< Person > findAllPageable(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
