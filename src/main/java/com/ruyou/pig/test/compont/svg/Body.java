package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;
import com.ruyou.pig.test.utils.ColorUtil;

/**
 * Created by zah on 2018/4/27.
 */
public class Body extends Base {
    public Body(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        StringBuilder style = new StringBuilder();
        String color = config.getBodyColor();
        style.append(".p_body_color{fill:" + color + ";}");
        style.append("\n");
        color = ColorUtil.getShadowColor();
        style.append(".p_body_shadow_color{fill:" + color + ";fill-opacity:0.2;}");
        style.append("\n");
        return style.toString();
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(1);
    }
}
