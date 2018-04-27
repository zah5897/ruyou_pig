package com.ruyou.pig.test.utils;

import java.util.Random;

/**
 * Created by zah on 2018/4/27.
 */
public class RandomUtil {
    public static int getRandomBetween(int start, int end) {
        return (new Random().nextInt(end)) + start;
    }
}
