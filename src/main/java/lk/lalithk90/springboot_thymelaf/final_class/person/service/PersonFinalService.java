package lk.lalithk90.springboot_thymelaf.final_class.person.service;

import lk.lalithk90.springboot_thymelaf.final_class.common_asset.enums.LiveDead;
import lk.lalithk90.springboot_thymelaf.final_class.person.dao.PersonFinalDao;
import lk.lalithk90.springboot_thymelaf.final_class.person.entity.PersonFinal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonFinalService {
  private final PersonFinalDao personFinalDao;

  public PersonFinalService(PersonFinalDao personFinalDao) {
    this.personFinalDao = personFinalDao;
  }

  // 1. findPerson all
  public List< PersonFinal > findAll() {
    return personFinalDao.findAll().stream().filter(x -> x.getLiveDead().equals(LiveDead.ACTIVE)).collect(Collectors.toList());
  }

  public List< PersonFinal > findAllStop() {
    return personFinalDao.findAll().stream().filter(x -> x.getLiveDead().equals(LiveDead.STOP)).collect(Collectors.toList());
  }

  // 2. findPerson By id
  public PersonFinal findById(Integer id) {
    return personFinalDao.getOne(id);
  }
  // 3. savePerson updated person

  public PersonFinal persist(PersonFinal personFinal) {
    if ( personFinal.getId() == null ) {
      personFinal.setLiveDead(LiveDead.ACTIVE);
    }
    return personFinalDao.save(personFinal);
  }

  // 4. deletePerson
  public boolean delete(Integer id) {
    PersonFinal personFinal = personFinalDao.getOne(id);
    personFinal.setLiveDead(LiveDead.STOP);
    personFinalDao.save(personFinal);
    return false;
  }

}
