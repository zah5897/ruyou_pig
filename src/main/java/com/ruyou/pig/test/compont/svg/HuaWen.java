package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;
import com.ruyou.pig.test.utils.ColorUtil;

/**
 * Created by zah on 2018/4/28.
 */
public class HuaWen extends Base {
    public HuaWen(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        StringBuilder style = new StringBuilder();
        switch (config.getHw()) {
            case 1:
                String color = config.getHwColor();
                style.append("\n");
                style.append(".p_1_hw_color{fill:" + color + ";}");
                break;
            case 2:
                color = config.getHwColor();
                style.append(".p_2_hw_color{fill:" + color + ";}");
                style.append("\n");

                color = ColorUtil.getShadowColor();
                style.append(".p_2_hw_shadow_color_1{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");
                style.append(".p_2_hw_shadow_color_2{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");
                break;
            case 3:
                color = config.getHwColor();
                style.append(".p_3_hw_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 4:
                color = config.getHwColor();
                style.append(".p_4_hw_color{fill:" + color + ";}");
                style.append("\n");

                color = ColorUtil.getShadowColor();
                style.append(".p_4_hw_shadow_color{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");

                break;
            case 5:

                color = config.getHwColor();
                style.append(".p_5_hw_color_1{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_5_hw_color_2{fill:" + color + ";}");
                style.append("\n");

                color = ColorUtil.getShadowColor();
                style.append(".p_5_hw_shadow_color_1{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");
                style.append(".p_5_hw_shadow_color_2{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");
                break;
            case 6:
                color = config.getHwColor();
                style.append(".p_6_hw_color_1{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_6_hw_color_2{fill:" + color + ";}");
                style.append("\n");

                color = ColorUtil.getShadowColor();
                style.append(".p_6_hw_shadow_color{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");

                break;
            case 7:
                color = config.getHwColor();
                style.append(".p_7_hw_color{fill:" + color + ";}");
                style.append("\n");

                color = ColorUtil.getShadowColor();
                style.append(".p_7_hw_shadow_color{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");

                break;
            default:
                color = config.getHwColor();
                style.append(".p_8_hw_color_1{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_8_hw_color_2{fill:" + color + ";}");
                style.append("\n");
                break;
        }
        return style.toString();
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(config.getHw());
    }
}
