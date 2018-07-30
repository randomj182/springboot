package com.random.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.random.domain.User;
import com.random.mapper.UserMapper;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年7月25日
 * 
 */
@Service
public class UserService {
	// service依赖mapper
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getUserList(){
		return userMapper.selectAll();
	}
	public User getUserPrimaryKey(Integer userId){
		return userMapper.selectByPrimaryKey(userId);
	}
}
