package com.ruyou.pig.test.compont;

import com.ruyou.pig.test.compont.svg.*;
import com.ruyou.pig.test.utils.ColorUtil;
import com.ruyou.pig.test.utils.FileUitl;
import com.ruyou.pig.test.utils.OSUtil;
import com.ruyou.pig.test.utils.RandomUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zah on 2018/4/27.
 */
public class PigCompontManager {
    private static PigCompontManager pigCompontManager = new PigCompontManager();
    private String svgName = "pig.svg_frame";
    private String svgName_scan = "pig.svg_frame_scan";

    private PigCompontManager() {
        initSvgFream();
    }

    public static PigCompontManager getInstance() {
        return pigCompontManager;
    }

    public void initSvgFream() {
        String freamPath = getRootPath();
        CompontCacheManager.getInstance().put(svgName, FileUitl.readFile(new File(freamPath + svgName)).trim());
        CompontCacheManager.getInstance().put(svgName_scan, FileUitl.readFile(new File(freamPath + svgName_scan)).trim());
    }

    public String getRootPath() {
        if (OSUtil.isLinux()) {
            return this.getClass().getResource("/").getPath() + "static/";
        } else {
            return "D:\\eth_pig\\ruyou_pig\\src\\main\\resources\\static\\";
        }
    }

    public String getPigSvg(boolean scan, PigConfig config) {
        List<Base> componts = initCompont(config);
        StringBuilder sb = new StringBuilder();
        sb.append(CompontCacheManager.getInstance().get(scan ? svgName_scan : svgName));
        //添加style.
        sb.append(getStyle(componts));

        //添加svg
        sb.append(getCompontSvg(componts));

        //添加结束标签
        //显示猪的信息
        sb.append("<text x=\"200\" y=\"50\" text-anchor=\"middle\" dominant-baseline=\"middle\">" + config.toString() + "</text>");

        sb.append("\n</svg>");
        return sb.toString();
    }

    private List<Base> initCompont(PigConfig config) {
        List<Base> bases = new ArrayList<>();
        bases.add(new Ear(config));
        bases.add(new Body(config));
        bases.add(new Dupi(config));
        bases.add(new Eye(config));
        bases.add(new Hand(config));
        bases.add(new Nose(config));
        return bases;
    }


    private String getStyle(List<Base> componts) {
        StringBuilder styles = new StringBuilder();
        styles.append("<style type=\"text/css\">");
        styles.append("\n");
        styles.append(".pig_shadow{fill:#C7C7C7;}");

        for (Base base : componts) {
            styles.append("\n");
            styles.append(base.getStyle());
        }

        styles.append("\n");
        styles.append("</style>");
        return styles.toString();
    }


    private String getCompontSvg(List<Base> componts) {
        StringBuilder compontSbu = new StringBuilder();

        compontSbu.append("\n<g id=\"pig\">\n");
        for (Base base : componts) {
            compontSbu.append("\n");
            String str = base.getCompontSvg();
            compontSbu.append(str);
        }
        compontSbu.append("\n</g>\n");
        return compontSbu.toString();
    }


    public synchronized String getPig(boolean scan, PigConfig config) {

        if (config.getBody() < 1 || config.getBody() > 8) {
            config.setBody(RandomUtil.getRandomBetween(1, 8));
        }

        if (config.getDupi() < 1 || config.getDupi() > 8) {
            config.setDupi(RandomUtil.getRandomBetween(1, 8));
        }

        if (config.getEye() < 1 || config.getEye() > 9) {
            config.setEye(RandomUtil.getRandomBetween(1, 8));
        }


        if (config.getNose() < 1 || config.getNose() > 8) {
            config.setNose(RandomUtil.getRandomBetween(1, 8));
        }
        if (config.getEar() < 1 || config.getEar() > 8) {
            config.setEar(RandomUtil.getRandomBetween(1, 8));
        }


        if (ColorUtil.isNotColor(config.getBodyColor())) {
            config.setBodyColor(ColorUtil.getRandColorCode());
        }

        if (ColorUtil.isNotColor(config.getHwColor())) {
            config.setHwColor(ColorUtil.getRandColorCode());
        }


        if (ColorUtil.isNotColor(config.getDupiColor())) {
            config.setDupiColor(ColorUtil.getRandColorCode());
        }

        if (ColorUtil.isNotColor(config.getEyeColor())) {
            config.setEyeColor(ColorUtil.getRandColorCode());
        }
        return PigCompontManager.getInstance().getPigSvg(scan, config);
    }

//    public static void main(String[] args) {
//        PigCompontManager.getInstance().test(true, null, null, null, null, null);
//    }
}
