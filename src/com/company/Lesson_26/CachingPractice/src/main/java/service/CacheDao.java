package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Создать кеш - void cache();
 * положить в кеш- boolean put(String cache, String key, String str);
 * достать - String get (String cache, String key);
 * очистить все кеши - void clear();
 * очистить кеш - void clear(string cache);
 * проверка наличие кеша void isCacheExist(String cache);
 */

@Service
public class CacheDao {
    private static Logger loggerResult = LoggerFactory.getLogger("logger.result");
    private static Map<String, Map<String, String>> mapCache;
    private static Map<String, String> tempCache = new HashMap<>();

    public CacheDao() {
        mapCache = new HashMap<>();
    }

    public void cache(String cache) {
        mapCache.put(cache, new HashMap<>());
        loggerResult.info(String.format("Create Cache with name '%s' ", cache));
    }

    public boolean put(String cache, String key, String str) {
        if (cache == null || key == null || str == null) {
            throw new IllegalArgumentException("One of arguments in method 'put' is null");
        }
        tempCache = mapCache.get(cache);


        if (tempCache != null) {
            tempCache.put(key, str);
            return true;
        } else {
            throw new NullPointerException(String.format("Cache with name '%s' not found%n", cache));
        }


    }

    public String get(String cache, String key) {
        tempCache = mapCache.get(cache);
        loggerResult.info(String.format("Get value from inner Cache with name : '%s'", key));
        if (cache != null) {
            return tempCache.get(key);
        } else {
            return null;
        }
    }

    public void clear() {
        mapCache.values().stream().forEach(map -> map.clear());
        loggerResult.info("Remove all");
    }

    public void clear(String cache) {
        tempCache = mapCache.get(cache);
        if (cache != null) tempCache.clear();
        loggerResult.info(String.format("Remove Cache with name : %s", cache));
    }

    public void isCacheExist(String cache) {
        if (mapCache.containsKey(cache)) {
            System.out.println("Cache exist");
        } else {
            System.out.println("Cache is not exist");
        }

    }
}
