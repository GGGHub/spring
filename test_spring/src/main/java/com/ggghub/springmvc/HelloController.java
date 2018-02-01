package com.ggghub.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LiSiYuan on 2018/1/31.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/index")
    public String hello(){
        return "index";
    }
}
