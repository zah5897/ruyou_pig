package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

/**
 * Created by zah on 2018/4/28.
 */
public class Shadow extends Base {
    public Shadow(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        return ".pig_shadow{fill:#C7C7C7;fill-opacity:0.4;}";
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(1);
    }
}
