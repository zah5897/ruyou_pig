package com.ruyou.pig.test.compont;

import com.ruyou.pig.test.utils.ColorUtil;
import com.ruyou.pig.test.utils.RandomUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zah on 2018/4/27.
 */
public class CompontCacheManager {

    private static CompontCacheManager compontCacheManager = new CompontCacheManager();

    private Map<String, String> compontCache;


    private List<String> allColors, lightColors;

    private CompontCacheManager() {
        compontCache = new ConcurrentHashMap<>();
        allColors = new ArrayList<>();
        lightColors = new ArrayList<>();
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


    public boolean addColorToAll(String color) {
        if (ColorUtil.isColor(color) && !allColors.contains(color)) {
            allColors.add(color);
            return true;
        } else {
            return false;
        }
    }

    public boolean addColorToLight(String color) {
        if (ColorUtil.isColor(color) && !lightColors.contains(color)) {
            lightColors.add(color);
            return true;
        } else {
            return false;
        }
    }

    public String getLightColor(List<String> ignoreColor) {
        if (ignoreColor == null) {
            return lightColors.get(RandomUtil.getRandom(lightColors.size()));
        } else {
            while (true) {
                String colorTemp = lightColors.get(RandomUtil.getRandom(lightColors.size()));
                if (!ignoreColor.contains(colorTemp)) {
                    return colorTemp;
                }
            }
        }
    }

    public String getColor(List<String> ignoreColor) {
        if (ignoreColor == null) {
            return allColors.get(RandomUtil.getRandom(allColors.size()));
        } else {
            while (true) {
                String colorTemp = allColors.get(RandomUtil.getRandom(allColors.size()));
                if (!ignoreColor.contains(colorTemp)) {
                    return colorTemp;
                }
            }
        }
    }
}
