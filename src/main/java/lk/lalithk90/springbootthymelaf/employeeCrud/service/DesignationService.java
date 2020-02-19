package lk.lalithk90.springbootthymelaf.employeeCrud.service;

import lk.lalithk90.springbootthymelaf.employeeCrud.dao.DesignationRepository;
import lk.lalithk90.springbootthymelaf.employeeCrud.entity.Designation;
import lk.lalithk90.springbootthymelaf.employeeCrud.service.util.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationService implements AbstractService< Designation, Integer > {
    private final DesignationRepository designationRepository;

    @Autowired
    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    @Override
    public List< Designation > findAll() {
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
    public List< Designation > search(Designation designation) {
        return null;
    }
}
