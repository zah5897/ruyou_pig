package com.ruyou.pig.test.controller;

import com.ruyou.pig.test.compont.PigCompontManager;
import com.ruyou.pig.test.compont.PigConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Controller
public class TestController {
    // 变  st0  st3 st4 st5
    @RequestMapping("/ok_pig_svg_scan")
    public String ok_pig_img(HttpServletResponse response, PigConfig config) {
        try {
            String svg = PigCompontManager.getInstance().getPig(true, config);
            response.getWriter().write(svg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/ok_pig_svg")
    public void ok_pig_svg(HttpServletResponse response, PigConfig config) {
        String svg = PigCompontManager.getInstance().getPig(false, config);
        response.setContentType("image/svg+xml");
        OutputStream stream = null;
        try {
            stream = response.getOutputStream();
            stream.write(svg.getBytes());
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
