package com.ruyou.pig.test.utils;

/**
 * Created by zah on 2018/4/27.
 */
public class OSUtil {
    public static boolean isLinux() {
        return System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;
    }
}
