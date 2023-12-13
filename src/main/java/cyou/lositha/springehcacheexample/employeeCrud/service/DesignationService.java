package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.DesignationRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Designation;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

@Service
public class DesignationService implements AbstractService<Designation, Integer> {
    private final DesignationRepository designationRepository;

    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    @Override
    public List<Designation> findAll() {
        return designationRepository.findAll();
    }

    @Override
    public Designation findById(Integer id) {
        return null;
    }

    @Override
    public Designation persist(Designation designation) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Designation> search(Designation designation) {
        return null;
    }
}
