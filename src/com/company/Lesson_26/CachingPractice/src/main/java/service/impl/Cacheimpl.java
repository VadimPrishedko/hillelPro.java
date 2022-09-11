package service.impl;

import org.springframework.stereotype.Service;
import service.Cache;
import service.CacheDao;

@Service
public class Cacheimpl implements Cache {
    private static CacheDao cacheDao;

    public Cacheimpl(CacheDao cacheDao) {
        Cacheimpl.cacheDao = cacheDao;
    }

    @Override
    public void cache(String cache) {
        cacheDao.cache(cache);
    }

    @Override
    public boolean put(String cache, String key, String str) {
        cacheDao.put(cache, key, str);
        return true;
    }

    @Override
    public String get(String cache, String key) {
        return cacheDao.get(cache, key);
    }

    @Override
    public void clear() {
        cacheDao.clear();

    }

    @Override
    public void clear(String cache) {
        cacheDao.clear(cache);
    }

    @Override
    public void isCacheExist(String cache) {
        cacheDao.isCacheExist(cache);
    }
}