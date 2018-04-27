package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

/**
 * Created by zah on 2018/4/27.
 */
public class Ear extends Base {
    public Ear(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        StringBuilder style = new StringBuilder();
        switch (config.getEar()) {
            case 1:
                String color = config.getBodyColor();
                style.append(".p_1_ear_color{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_1_ear_shadow_color{fill:" + color + ";}");
                break;
            case 2:

                color = config.getBodyColor();
                style.append(".p_2_ear_color{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_2_ear_shadow_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 3:

                color = config.getBodyColor();
                style.append(".p_3_ear_color{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_3_ear_shadow_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 4:
                color = config.getBodyColor();
                style.append(".p_4_ear_color{fill:" + color + ";}");
                style.append("\n");


                break;
            case 5:
                color = config.getBodyColor();
                style.append(".p_5_ear_color{fill:" + color + ";}");
                style.append("\n");


                style.append(".p_5_ear_shadow_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 6:
                color = config.getBodyColor();
                style.append(".p_6_ear_color{fill:" + color + ";}");
                style.append("\n");


                style.append(".p_6_ear_shadow_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 7:
                color = config.getBodyColor();
                style.append(".p_7_ear_color{fill:" + color + ";}");
                style.append("\n");
                break;

            default:
                color = config.getBodyColor();
                style.append(".p_8_ear_color{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_8_ear_shadow_color{fill:" + color + ";}");
                style.append("\n");
                break;
        }
        return style.toString();
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(config.getEar());
    }
}
