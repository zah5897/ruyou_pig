package com.ruyou.pig.test.utils;

import com.ruyou.pig.test.compont.CompontCacheManager;
import com.ruyou.pig.test.compont.PigCompontManager;

import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;

/**
 * Created by zah on 2018/4/27.
 */
public class ColorUtil {
    public static String getRandColorCode() {
        String r, g, b;
        Random random = new Random();
        r = Integer.toHexString(random.nextInt(200) + 50).toUpperCase();
        g = Integer.toHexString(random.nextInt(200) + 50).toUpperCase();
        b = Integer.toHexString(random.nextInt(200) + 50).toUpperCase();
        r = r.length() == 1 ? "0" + r : r;
        g = g.length() == 1 ? "0" + g : g;
        b = b.length() == 1 ? "0" + b : b;
        return "#" + r + g + b;
    }

    public static boolean isColor(String color) {
        if (color == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{3})$");
        return pattern.matcher(color).matches();
    }

    public static boolean isNotColor(String color) {
        return !isColor(color);
    }


    public static void initPigColor(String rootPath) {
        String path = rootPath + "color/";
        //初始化全部颜色
        FileUitl.readFile(new File(path + "all_color.txt"), new LineCallback() {
            @Override
            public void onLine(String line) {
                if (TextUtils.isNotEmpty(line)) {
                    CompontCacheManager.getInstance().addColorToAll(line);
                }
            }
        });
        FileUitl.readFile(new File(path + "light_color.txt"), new
                LineCallback() {
                    @Override
                    public void onLine(String line) {
                        if (TextUtils.isNotEmpty(line)) {
                            CompontCacheManager.getInstance().addColorToLight(line);
                        }
                    }
                });
    }

    public static String getShadowColor() {
        return "#000000";
    }

    interface LineCallback {
        void onLine(String line);
    }
}



