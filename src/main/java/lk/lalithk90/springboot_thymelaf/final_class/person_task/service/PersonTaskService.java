package lk.lalithk90.springboot_thymelaf.final_class.person_task.service;

import lk.lalithk90.springboot_thymelaf.final_class.person_task.dao.PersonTaskDao;
import lk.lalithk90.springboot_thymelaf.final_class.person_task.entity.PersonTask;
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
  public List< PersonTask > findAll() {
    return personTaskDao.findAll();
  }

  // 2. findPersonTask By id
  public PersonTask findById(Integer id) {
    return personTaskDao.getOne(id);
  }
  // 3. savePersonTask updated person

  public PersonTask persist(PersonTask personTask) {
    if ( personTask.getId() == null ) {
      personTask.setPersonTaskStatus(PersonTaskStatus.AC);
    }
    return personTaskDao.save(personTask);
  }

  // 4. deletePersonTask
  public boolean delete(Integer id) {
    PersonTask personTask = personTaskDao.getOne(id);
    personTask.setPersonTaskStatus(PersonTaskStatus.CL);
    personTaskDao.save(personTask);
    return false;
  }

}
