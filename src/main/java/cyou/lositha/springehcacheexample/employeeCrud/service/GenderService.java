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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.employeeCrud.dao.GenderRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Gender;
import cyou.lositha.springehcacheexample.employeeCrud.service.util.AbstractService;

import javax.cache.Cache;
import javax.cache.CacheManager;

@Service
@CacheConfig(cacheNames = "gender")
public class GenderService {
    private final GenderRepository genderRepository;
    
    @Autowired
    private CacheManager cacheManager;

    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

   
    public List<Gender> findAll() {
        long dbCount = genderRepository.count();
        System.out.println("db count " + dbCount);
        Cache<Long, Gender> cache = cacheManager.getCache("gender", Long.class, Gender.class);
        List<Gender> cacheStore = new ArrayList<>();
        List<Gender> finalCacheStore = cacheStore;
        System.out.println(cache);
        cache.forEach(entry -> {
            if (entry != null) {
                finalCacheStore.add(entry.getValue());
            }
        });
        if (!finalCacheStore.isEmpty() && dbCount == finalCacheStore.size()) {
            return finalCacheStore;
        } else {
            cacheStore = genderRepository.findAll();
            cacheStore.forEach(x -> {
                cache.put(x.getId(), x);
            });
            System.out.println("find all");
            return cacheStore;
        }
    }

    @Cacheable(value = "gender", key = "#id")
    public Gender findById(Long id) {
        return genderRepository.getReferenceById(id);
    }

    @CachePut(key = "#gender.id")
    public Gender persist(Gender gender) {
        return genderRepository.save(gender);
    }

    @CacheEvict(key = "#id")
    public boolean delete(Long id) {
        genderRepository.deleteById(id);
        return true;
    }

   
    public List<Gender> search(Gender gender) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Gender> genderExample = Example.of(gender, matcher);
        return genderRepository.findAll(genderExample);
    }

    public Page<Gender> findAllPageable(Pageable pageable) {
        return genderRepository.findAll(pageable);
    }
}
