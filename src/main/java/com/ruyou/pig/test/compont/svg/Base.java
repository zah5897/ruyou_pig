package com.ruyou.pig.test.compont.svg;

import com.ruyou.pig.test.compont.CompontCacheManager;
import com.ruyou.pig.test.compont.PigCompontManager;
import com.ruyou.pig.test.compont.PigConfig;
import com.ruyou.pig.test.utils.FileUitl;
import com.ruyou.pig.test.utils.TextUtils;

import java.io.File;

/**
 * Created by zah on 2018/4/27.
 */
public abstract class Base {
    protected PigConfig config;

    public Base(PigConfig config) {
        this.config = config;
    }

    public abstract String getStyle();

    public abstract String getCompontSvg();

    protected String getCompontSvgXml(int index) {
        String name = this.getClass().getSimpleName().toLowerCase();
        String content = CompontCacheManager.getInstance().get(name + index);
        if (TextUtils.isNotEmpty(content)) {
            return content;
        } else {
            String path = PigCompontManager.getInstance().getRootPath() + "pig_compont/" + name + "/" + index + ".txt";
            content = FileUitl.readFile(new File(path));
            CompontCacheManager.getInstance().put(name + index, content);
            return content;
        }

    }
}
