package cyou.lositha.springehcacheexample.years.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.cache.Cache;
import javax.cache.CacheManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import cyou.lositha.springehcacheexample.years.dao.YearsDao;
import cyou.lositha.springehcacheexample.years.entity.Years;
import cyou.lositha.springehcacheexample.years.service.YearsService;

@Service
@CacheConfig(cacheNames = "years")
public class YearsServiceImpl implements YearsService {

    private final YearsDao yearsDao;

    @Autowired
    private CacheManager cacheManager;

    public YearsServiceImpl(YearsDao yearsDao) {
        this.yearsDao = yearsDao;
    }

    public List<Years> findAll() {
        long dbCount = yearsDao.count();
        System.out.println("db count " + dbCount);
        Cache<Long, Years> cache = cacheManager.getCache("years", Long.class, Years.class);
        List<Years> cacheStore = new ArrayList<>();
        List<Years> finalCacheStore = cacheStore;
        System.out.println(cache);
        cache.forEach(entry -> {
            if (entry != null) {
                finalCacheStore.add(entry.getValue());
            }
        });
        if (!finalCacheStore.isEmpty() && dbCount == finalCacheStore.size()) {
            return finalCacheStore;
        } else {
            cacheStore = yearsDao.findAll();
            cacheStore.forEach(x -> {
                cache.put(x.getId(), x);
            });
            System.out.println("find all");
            return cacheStore;
        }
    }

    @Cacheable(value = "years", key = "#id")
    public Years findById(Long id) {
        System.out.println("findBy id");
        return yearsDao.getReferenceById(id);
    }

    @CachePut(key = "#years.id")
    public Years persist(Years years) {
        System.out.println("save");
        return yearsDao.save(years);
    }

    @CacheEvict(key = "#id")
    public void delete(Long id) {
        System.out.println("delete");
        yearsDao.deleteById(id);
    }

    public List<Years> search(Years years) {
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Years> userExample = Example.of(years, matcher);
        return yearsDao.findAll(userExample);
    }
}
