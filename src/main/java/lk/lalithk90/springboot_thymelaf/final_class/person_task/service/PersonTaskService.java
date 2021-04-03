package lk.lalithk90.springboot_thymelaf.final_class.person_task.service;

import lk.lalithk90.springboot_thymelaf.final_class.person_task.dao.PersonTaskDao;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonFinalTask;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.enums.PersonTaskStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonTaskService {
  private final PersonTaskDao personTaskDao;

  public PersonTaskService(PersonTaskDao personTaskDao) {
    this.personTaskDao = personTaskDao;
  }

  // 1. findPersonTask all
  public List< PersonFinalTask > findAll() {
    return personTaskDao.findAll();
  }

  // 2. findPersonTask By id
  public PersonFinalTask findById(Integer id) {
    return personTaskDao.getOne(id);
  }
  // 3. savePersonTask updated person

  public PersonFinalTask persist(PersonFinalTask personFinalTask) {
    if ( personFinalTask.getId() == null ) {
      personFinalTask.setPersonTaskStatus(PersonTaskStatus.AC);
    }
    return personTaskDao.save(personFinalTask);
  }

  // 4. deletePersonTask
  public boolean delete(Integer id) {
    PersonFinalTask personFinalTask = personTaskDao.getOne(id);
    personFinalTask.setPersonTaskStatus(PersonTaskStatus.CL);
    personTaskDao.save(personFinalTask);
    return false;
  }

}
