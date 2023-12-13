package cyou.lositha.springehcacheexample.hibernate.manyToMany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.hibernate.manyToMany.dao.StudentManyToManyRepository;
import cyou.lositha.springehcacheexample.hibernate.manyToMany.entity.StudentManyToMany;

@Service
public class StudentManyToManyService {
    private final StudentManyToManyRepository studentManyToManyRepository;

    public StudentManyToManyService(StudentManyToManyRepository studentManyToManyRepository) {
        this.studentManyToManyRepository = studentManyToManyRepository;
    }

    public List<StudentManyToMany> findAll() {
        return studentManyToManyRepository.findAll();
    }

    public StudentManyToMany findById(Integer id) {
        return null;
    }

    public StudentManyToMany persist(StudentManyToMany studentManyToMany) {
        return null;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public List<StudentManyToMany> search(StudentManyToMany studentManyToMany) {
        return null;
    }
}
