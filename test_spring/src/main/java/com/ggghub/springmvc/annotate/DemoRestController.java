package com.ggghub.springmvc.annotate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by LiSiYuan on 2018/2/1.
 */

@RestController
@RequestMapping(value = "/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson")
    public DemoObj getjosn(DemoObj obj){
        return obj;
    }
}
