package com.ruyou.pig.test.compont;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zah on 2018/4/27.
 */
public class CompontCacheManager {

    private static CompontCacheManager compontCacheManager = new CompontCacheManager();

    private Map<String, String> compontCache;

    private CompontCacheManager() {
        compontCache = new ConcurrentHashMap<>();
    }

    public static CompontCacheManager getInstance() {
        return compontCacheManager;
    }

    public void put(String key, String value) {
        compontCache.put(key, value);
    }

    public String get(String key) {
        return compontCache.get(key);
    }
}
