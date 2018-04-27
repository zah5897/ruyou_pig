package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

/**
 * Created by zah on 2018/4/27.
 */
public class Hand extends Base {
    public Hand(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {

        return "";
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(1);
    }
}
