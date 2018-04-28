package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.PigConfig;
import com.ruyou.pig.test.utils.ColorUtil;

/**
 * Created by zah on 2018/4/27.
 */
public class Eye extends Base {
    public Eye(PigConfig config) {
        super(config);
    }

    @Override
    public String getStyle() {
        StringBuilder style = new StringBuilder();
        switch (config.getEye()) {
            case 1:
//                String color = config.getEyeColor();
                String color = "#FFFFFF";
                style.append(".p_1_eye_color{fill:" + color + ";}");
                style.append("\n");
                color = config.getEyeColor();
                style.append(".p_1_eye_ball_color{fill:" + color + ";}");
                break;
            case 2:
                  color = "#FFFFFF";
                style.append(".p_2_eye_color{fill:" + color + ";}");
                style.append("\n");
                color=config.getEyeColor();
                style.append(".p_2_eye_ball_color{fill:" + color + ";}");
                break;
            case 3:
                break;
            case 4:
                color =  "#FFFFFF";
                style.append(".p_4_eye_color{fill:" + color + ";}");
                style.append("\n");
                color=config.getEyeColor();
                style.append(".p_4_eye_ball_color{fill:" + color + ";}");
                break;
            case 5:

                color = "#FFFFFF";
                style.append(".p_5_eye_color{fill:" + color + ";}");
                style.append("\n");
                color=config.getEyeColor();
                style.append(".p_5_eye_ball_color{fill:" + color + ";}");

                break;
            case 6:
                color =  "#FFFFFF";
                style.append(".p_6_eye_color{fill:" + color + ";}");
                style.append("\n");
                color=config.getEyeColor();
                style.append(".p_6_eye_ball_color{fill:" + color + ";}");
                break;
            case 7:

                color =  "#FFFFFF";
                style.append(".p_7_eye_color{fill:" + color + ";}");



                style.append("\n");
                color=config.getEyeColor();
                style.append(".p_7_eye_ball_color{fill:" + color + ";}");
                style.append("\n");
                style.append(".p_7_eye_skin_color{fill:" + color + ";}");

                break;
            default:
                color =  "#FFFFFF";
                style.append(".p_8_eye_color{fill:" + color + ";}");
                style.append("\n");
                color=config.getEyeColor();
                style.append(".p_8_eye_ball_color{fill:" + color + ";}");
                break;
        }
        return style.toString();
    }

    @Override
    public String getCompontSvg() {
        return getCompontSvgXml(config.getEye());
    }
}
