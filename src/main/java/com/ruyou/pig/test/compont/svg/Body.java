package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;

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
        switch (config.getBody()) {
            case 1:
                String color = config.getBodyColor();
                style.append(".p_1_body_color{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_1_body_shadow_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_1_hw_color{fill:" + color + ";}");
                break;
            case 2:

                color = config.getBodyColor();
                style.append(".p_2_body_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_2_hw_color{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_2_hw_shadow_color_1{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_2_hw_shadow_color_2{fill:" + color + ";}");
                style.append("\n");

                break;
            case 3:

                color = config.getBodyColor();
                style.append(".p_3_body_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_2_hw_color{fill:" + color + ";}");
                style.append("\n");

                break;
            case 4:
                color = config.getBodyColor();
                style.append(".p_4_body_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_4_hw_color{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_4_hw_shadow_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 5:

                color = config.getBodyColor();
                style.append(".p_5_body_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_5_hw_color_1{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_5_hw_color_2{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_5_hw_shadow_color_1{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_5_hw_shadow_color_2{fill:" + color + ";}");
                style.append("\n");
                break;
            case 6:
                color = config.getBodyColor();
                style.append(".p_6_body_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_6_hw_color_1{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_6_hw_color_2{fill:" + color + ";}");
                style.append("\n");


                style.append(".p_6_hw_shadow_color{fill:" + color + ";}");
                style.append("\n");
                break;
            case 7:

                color = config.getBodyColor();
                style.append(".p_7_body_color{fill:" + color + ";}");
                style.append("\n");

                color = config.getHwColor();
                style.append(".p_7_hw_color{fill:" + color + ";}");
                style.append("\n");

                style.append(".p_7_hw_shadow_color{fill:" + color + ";}");
                style.append("\n");
                break;
            default:
                color = config.getBodyColor();
                style.append(".p_8_body_color{fill:" + color + ";}");
                style.append("\n");

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
        return getCompontSvgXml(config.getBody());
    }
}
