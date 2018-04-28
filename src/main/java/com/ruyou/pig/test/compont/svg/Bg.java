package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

/**
 * Created by zah on 2018/4/28.
 */
public class Bg extends Base {
    private String bgColor;

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public Bg(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        return "";
    }

    @Override
    public String getCompontSvg() {
        return "<rect width=\"100%\" height=\"100%\" fill=\""+bgColor+"\" />";
    }
}
