package service;

public interface Cache {
    void cache(String cache);
    boolean put(String cache, String key, String str);
    String get(String cache, String key);
    void clear();
    void clear(String cache);
    void isCacheExist(String cache);
}
