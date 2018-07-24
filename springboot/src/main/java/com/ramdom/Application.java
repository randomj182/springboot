package com.ramdom;
/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年7月24日
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
@Configuration
//启用自动配置
@EnableAutoConfiguration

public class Application {
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

