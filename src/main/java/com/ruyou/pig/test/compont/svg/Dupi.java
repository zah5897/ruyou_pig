package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;
import com.ruyou.pig.test.utils.ColorUtil;

/**
 * Created by zah on 2018/4/27.
 */
public class Dupi extends Base {
    public Dupi(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        StringBuilder style = new StringBuilder();
        switch (config.getDupi()) {
            case 1:
                String color = config.getDupiColor();
                style.append("\n");
                style.append(".p_1_duzi_color{fill:" + color + ";}");
                break;
            case 2:
                color = config.getDupiColor();
                style.append(".p_2_duzi_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 3:
                color = config.getDupiColor();
                style.append(".p_3_duzi_color{fill:" + color + ";}");
                style.append("\n");

                color = ColorUtil.getShadowColor();
                style.append(".p_3_duzi_shadow_color{fill:" + color + ";fill-opacity:0.2;}");
                style.append("\n");

                break;
            case 4:

                color = config.getDupiColor();
                style.append(".p_4_duzi_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 5:

                color = config.getDupiColor();
                style.append(".p_5_duzi_color_1{fill:" + color + ";}");
                style.append("\n");


                style.append(".p_5_duzi_color_2{fill:" + color + ";}");
                style.append("\n");
                break;
            case 6:


                color = config.getDupiColor();
                style.append(".p_6_duzi_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 7:
                color = config.getDupiColor();
                style.append(".p_7_duzi_color_1{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_7_duzi_color_2{fill:" + color + ";}");
                style.append("\n");

                break;
            default:
                color = config.getDupiColor();
                style.append(".p_8_duzi_color{fill:" + color + ";}");
                style.append("\n");
                break;
        }
        return style.toString();
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(config.getDupi());
    }
}
