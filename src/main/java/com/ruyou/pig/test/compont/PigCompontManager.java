package com.ruyou.pig.test.compont;

import com.ruyou.pig.test.compont.svg.*;
import com.ruyou.pig.test.utils.ColorUtil;
import com.ruyou.pig.test.utils.FileUitl;
import com.ruyou.pig.test.utils.OSUtil;
import com.ruyou.pig.test.utils.RandomUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
        //初始化svg框架片段
        String freamPath = getRootPath();
        CompontCacheManager.getInstance().put(svgName, FileUitl.readFile(new File(freamPath + svgName)).trim());
        CompontCacheManager.getInstance().put(svgName_scan, FileUitl.readFile(new File(freamPath + svgName_scan)).trim());

        //初始化颜色
        ColorUtil.initPigColor(freamPath);
    }

    public String getRootPath() {
        if (OSUtil.isLinux()) {
            return this.getClass().getResource("/").getPath() + "static/pig_compont/";
        } else {
            return "D:\\eth_pig\\ruyou_pig\\src\\main\\resources\\static\\pig_compont\\";
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


        sb.append("\n</svg>");
        return sb.toString();
    }

    private List<Base> initCompont(PigConfig config) {

        List<Base> bases = new ArrayList<>();
        //注意顺序
        Bg bg = new Bg(config);
        List<String> ignoreColor = Arrays.asList(new String[]{config.getDupiColor(), config.getHwColor(), config.getBodyColor(), config.getEyeColor()});
        bg.setBgColor(CompontCacheManager.getInstance().getLightColor(ignoreColor));
        bases.add(bg);
        bases.add(new Shadow(config));

        bases.add(new Ear(config));
        bases.add(new Body(config));
        bases.add(new Dupi(config));

        bases.add(new HuaWen(config));

        bases.add(new Eye(config));
        bases.add(new Hand(config));
        bases.add(new Nose(config));
        bases.add(new Text(config));
        return bases;
    }


    private String getStyle(List<Base> componts) {
        StringBuilder styles = new StringBuilder();
        styles.append("<style type=\"text/css\">");
        styles.append("\n");

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

        if (config.getHw() < 1 || config.getHw() > 8) {
            config.setHw(RandomUtil.getRandomBetween(1, 8));
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


        List<String> ignoreColors = null;
        String body = CompontCacheManager.getInstance().getLightColor(ignoreColors);
        config.setBodyColor(body);

        ignoreColors = new ArrayList<>();
        ignoreColors.add(body);

        String dupi = CompontCacheManager.getInstance().getLightColor(ignoreColors);
        config.setDupiColor(dupi);
        ignoreColors.add(dupi);


        String eyecolor = CompontCacheManager.getInstance().getColor(ignoreColors);
        config.setEyeColor(eyecolor);
        ignoreColors.add(eyecolor);

        config.setHwColor(CompontCacheManager.getInstance().getColor(ignoreColors));

        return PigCompontManager.getInstance().getPigSvg(scan, config);
    }

//    public static void main(String[] args) {
//        PigCompontManager.getInstance().test(true, null, null, null, null, null);
//    }
}
