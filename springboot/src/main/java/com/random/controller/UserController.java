package com.random.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.random.domain.User;
import com.random.service.UserService;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年7月25日
 * 
 */
@Controller
public class UserController {
	// controller层是建立在service层之上的
	@Autowired
	private UserService userService;
	
	// 数据接口:/getUserList : get
	@RequestMapping("/getUserList")
	@ResponseBody
	public String getUserList(){
		String resultJson = null;
		List<User> userList = userService.getUserList();
		resultJson = JSONArray.toJSONString(userList);
		System.out.println(resultJson);
		return resultJson;
	}
	
	// 数据接口:/getUserList : get
	@RequestMapping("/getUserById")
	@ResponseBody
	public String getUserById(){
		String resultJson = null;
		Integer userId = 1;
		User user = userService.getUserPrimaryKey(userId);
		resultJson = JSONArray.toJSONString(user);
		System.out.println(resultJson);
		return resultJson;
	}
}
