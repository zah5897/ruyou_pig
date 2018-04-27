package com.ruyou.pig.test.compont;

/**
 * Created by zah on 2018/4/27.
 */
public class PigConfig {
    private int body;
    private int nose;
    private int eye;
    private int ear;
    private int dupi;

    private String eyeColor;
    private String bodyColor;
    private String hwColor;
    private String dupiColor;

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getNose() {
        return nose;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getEar() {
        return ear;
    }

    public void setEar(int ear) {
        this.ear = ear;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getHwColor() {
        return hwColor;
    }

    public void setHwColor(String hwColor) {
        this.hwColor = hwColor;
    }

    public String getDupiColor() {
        return dupiColor;
    }

    public void setDupiColor(String dupiColor) {
        this.dupiColor = dupiColor;
    }

    public int getDupi() {
        return dupi;
    }

    public void setDupi(int dupi) {
        this.dupi = dupi;
    }

    @Override
    public String toString() {
        return "PigConfig{" +
                "body=" + body +
                ", nose=" + nose +
                ", eye=" + eye +
                ", ear=" + ear +
                ", dupi=" + dupi +
                ", eyeColor='" + eyeColor + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", hwColor='" + hwColor + '\'' +
                ", dupiColor='" + dupiColor + '\'' +
                '}';
    }
}
