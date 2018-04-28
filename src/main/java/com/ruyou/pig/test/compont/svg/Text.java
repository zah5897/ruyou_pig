package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

/**
 * Created by zah on 2018/4/28.
 */
public class Text extends Base {
    public Text(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        return "";
    }

    @Override
    public String getCompontSvg() {
        return "<text x=\"200\" y=\"50\" text-anchor=\"middle\" dominant-baseline=\"middle\">" + config.toString() + "</text>";
    }
}
