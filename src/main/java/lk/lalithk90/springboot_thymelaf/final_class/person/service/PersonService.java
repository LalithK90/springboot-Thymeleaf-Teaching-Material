package lk.lalithk90.springboot_thymelaf.final_class.person.service;

import lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums.LiveDead;
import lk.lalithk90.springboot_thymelaf.final_class.person.dao.PersonDao;
import lk.lalithk90.springboot_thymelaf.final_class.person.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
  private final PersonDao personDao;

  public PersonService(PersonDao personDao) {
    this.personDao = personDao;
  }

  // 1. findPerson all
  public List< Person > findAll() {
    return personDao.findAll().stream().filter(x -> x.getLiveDead().equals(LiveDead.ACTIVE)).collect(Collectors.toList());
  }

  public List< Person > findAllStop() {
    return personDao.findAll().stream().filter(x -> x.getLiveDead().equals(LiveDead.STOP)).collect(Collectors.toList());
  }

  // 2. findPerson By id
  public Person findById(Integer id) {
    return personDao.getOne(id);
  }
  // 3. savePerson updated person

  public Person persist(Person person) {
    if ( person.getId() == null ) {
      person.setLiveDead(LiveDead.ACTIVE);
    }
    return personDao.save(person);
  }

  // 4. deletePerson
  public boolean delete(Integer id) {
    Person person = personDao.getOne(id);
    person.setLiveDead(LiveDead.STOP);
    personDao.save(person);
    return false;
  }

}
