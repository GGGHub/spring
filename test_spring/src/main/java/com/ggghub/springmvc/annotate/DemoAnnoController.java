package com.ggghub.springmvc.annotate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LiSiYuan on 2018/2/1.
 */


@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
    @RequestMapping(produces = "text/plain;charset=UTF-8")  //produces可定制返回的respons的媒体类型和字符集
    public String index(HttpServletRequest request){
        return "url:" + request.getRequestURL()+"can access";
    }
    @RequestMapping(value = "/pathvar/{str}")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access,str:"+str;
    }
    @RequestMapping(value = "/requsetParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id,HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access,id:"+id;
    }
    @RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")
    public @ResponseBody String passObj(DemoObj obj,HttpServletRequest request){
        return "url:"+request.getRequestURL()+"can access,obj id:"+obj.getId()+"obj name"+obj.getName();
    }
    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest request){
        return  "url:" + request.getRequestURL()+"can access";
    }

}
