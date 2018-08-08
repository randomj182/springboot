package com.random.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ramdom.Application;
import com.random.domain.User;
import com.random.mapper.UserMapper;

/**
 * @description mybatis注解方式测试类.
 * @author random
 * @version 1.0
 * @date 2018年7月30日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void getUserList(){
		List<User> userList = userMapper.selectAll();
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}
}
