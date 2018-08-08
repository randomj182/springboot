package com.random.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ramdom.exception.MyException;

/**
 * @description Hello控制层 异常处理控制操作.
 * @author random
 * @version 1.0
 * @date 2018年8月6日
 * 
 */
@Controller
public class HelloController {

    /*@RequestMapping("/index")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }*/
    /**
     * 异常错误处理返回错误页面
     */
    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");  
    }
    
    /**
     * 异常错误处理返回json格式
     * 根据抛出的异常类型匹配到对应的异常处理方法
     */
    @RequestMapping("/returnJson")
    public String testErrorReturn2() throws MyException {
        throw new MyException("请求出错2");
    }

    @RequestMapping("/")
    public String index2(ModelMap map){
        map.addAttribute("host","http://baidu.com");
        return "index";
    }
    
}