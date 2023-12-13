package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.DesignationRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Designation;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

@Service
public class DesignationService implements AbstractService<Designation, Long> {
    private final DesignationRepository designationRepository;

    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

   
    public List<Designation> findAll() {
        return designationRepository.findAll();
    }

   
    public Designation findById(Long id) {
        return designationRepository.getReferenceById(id);
    }

   
    public Designation persist(Designation designation) {
        return designationRepository.save(designation);
    }

   
    public boolean delete(Long id) {
        designationRepository.deleteById(id);
        return false;
    }

   
    public List<Designation> search(Designation designation) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Designation> employeeExample = Example.of(designation, matcher);
        return designationRepository.findAll(employeeExample);
    }
}
