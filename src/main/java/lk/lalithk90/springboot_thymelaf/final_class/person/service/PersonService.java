package lk.lalithk90.springboot_thymelaf.final_class.person.service;

import lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums.LiveDead;
import lk.lalithk90.springboot_thymelaf.final_class.person.dao.PersonDao;
import lk.lalithk90.springboot_thymelaf.final_class.person.entity.PersonFinal;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
  private final PersonDao personDao;

  public PersonService(PersonDao personDao) {
    this.personDao = personDao;
  }

  // 1. findPerson all
  public List< PersonFinal > findAll() {
    return personDao.findAll().stream().filter(x -> x.getLiveDead().equals(LiveDead.ACTIVE)).collect(Collectors.toList());
  }

  public List< PersonFinal > findAllStop() {
    return personDao.findAll().stream().filter(x -> x.getLiveDead().equals(LiveDead.STOP)).collect(Collectors.toList());
  }

  // 2. findPerson By id
  public PersonFinal findById(Integer id) {
    return personDao.getOne(id);
  }
  // 3. savePerson updated person

  public PersonFinal persist(PersonFinal personFinal) {
    if ( personFinal.getId() == null ) {
      personFinal.setLiveDead(LiveDead.ACTIVE);
    }
    return personDao.save(personFinal);
  }

  // 4. deletePerson
  public boolean delete(Integer id) {
    PersonFinal personFinal = personDao.getOne(id);
    personFinal.setLiveDead(LiveDead.STOP);
    personDao.save(personFinal);
    return false;
  }

}
