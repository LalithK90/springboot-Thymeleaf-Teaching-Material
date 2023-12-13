package cyou.lositha.springehcacheexample;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CustomCacheEventLogger implements CacheEventListener<Object, Object> {

   
    public void onEvent(CacheEvent<?, ?> cacheEvent) {
        // log.info("Key: {} | EventType: {} | Old value: {} | New value: {}",
        // cacheEvent.getKey(), cacheEvent.getType(), cacheEvent.getOldValue(),
        // cacheEvent.getNewValue());
        log.info("Key: {} | EventType: {} |",
                cacheEvent.getKey(), cacheEvent.getType());
    }
}