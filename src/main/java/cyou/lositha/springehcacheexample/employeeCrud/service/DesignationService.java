package cyou.lositha.springehcacheexample.employeeCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.DesignationRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Designation;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

import javax.cache.Cache;
import javax.cache.CacheManager;

@Service
@CacheConfig(cacheNames = "designation")
public class DesignationService implements AbstractService<Designation, Long> {
    private final DesignationRepository designationRepository;
    @Autowired
    private CacheManager cacheManager;
    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

   
    public List<Designation> findAll() {
        long dbCount = designationRepository.count();
        Cache<Long, Designation> cache = cacheManager.getCache("designation", Long.class, Designation.class);
        List<Designation> cacheStore = new ArrayList<>();
        List<Designation> finalCacheStore = cacheStore;
        cache.forEach(entry -> {
            if (entry != null) {
                finalCacheStore.add(entry.getValue());
            }
        });
        if (!finalCacheStore.isEmpty() && dbCount == finalCacheStore.size()) {
            return finalCacheStore;
        } else {
            cacheStore = designationRepository.findAll();
            cacheStore.forEach(x -> {
                cache.put(x.getId(), x);
            });
            System.out.println("find all");
            return cacheStore;
        }
    }

    @Cacheable(value = "designation", key = "#id")
    public Designation findById(Long id) {
        return designationRepository.getReferenceById(id);
    }

    @CachePut(key = "#designation.id")
    public Designation persist(Designation designation) {
        return designationRepository.save(designation);
    }

    @CacheEvict(key = "#id")
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
