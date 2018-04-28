package com.ruyou.pig.test.utils;


import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zah on 2018/4/27.
 */
public class FileUitl {
    public static String readFile(File file) {
        BufferedReader br = null;
        InputStreamReader inr = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            inr = new InputStreamReader(inputStream, "UTF-8");
            br = new BufferedReader(inr);
            String line = null;
            StringBuilder builder = new StringBuilder();
            while ((line = br.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void readFile(File file, ColorUtil.LineCallback callback) {
        BufferedReader br = null;
        InputStreamReader inr = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            inr = new InputStreamReader(inputStream, "UTF-8");
            br = new BufferedReader(inr);
            String line = null;
            while ((line = br.readLine()) != null) {
                if (callback != null) {
                    callback.onLine(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}