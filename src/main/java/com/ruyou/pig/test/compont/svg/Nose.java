package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

/**
 * Created by zah on 2018/4/27.
 */
public class Nose extends Base {
    public Nose(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        StringBuilder style = new StringBuilder();
        switch (config.getNose()) {
            case 1:
                String color = config.getBodyColor();
                style.append(".p_1_nose_color_1{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_1_nose_color_2{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_1_nose_color_3{fill:" + color + ";}");
                break;
            case 2:
                color = config.getBodyColor();
                style.append(".p_2_nose_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 3:
                color = config.getBodyColor();
                style.append(".p_3_nose_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 4:
                color = config.getBodyColor();
                style.append(".p_4_nose_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 5:
                color = config.getBodyColor();
                style.append(".p_5_nose_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 6:
                color = config.getBodyColor();
                style.append(".p_6_nose_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 7:
                color = config.getBodyColor();
                style.append(".p_7_nose_color{fill:" + color + ";}");
                style.append("\n");
                break;
            default:
                color = config.getBodyColor();
                style.append(".p_8_nose_color{fill:" + color + ";}");
                style.append("\n");
                break;
        }
        return style.toString();
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(config.getNose());
    }
}
