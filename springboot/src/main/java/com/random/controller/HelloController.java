package com.random.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description Hello控制层.
 * @author random
 * @version 1.0
 * @date 2018年8月6日
 * 
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }
    @RequestMapping("/error")
    public String Hello() throws Exception {
        throw new Exception("发生错误");  
    }
}