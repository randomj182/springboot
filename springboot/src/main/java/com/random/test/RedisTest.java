package com.random.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.random.Application;
import com.random.domain.Kid;

/**
 * @description Redis访问测试类.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class RedisTest {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Test
	// 测试保存字符串
	public void saveString() throws Exception{
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}
	
	
	@Autowired
	private RedisTemplate<String, Kid> redisTemplate;
	@Test
	// 测试保存对象
	public void test() throws Exception{
		// 保存对象
		Kid kid = new Kid("超人", 20);
		redisTemplate.opsForValue().set(kid.getUsername(), kid);
		
		kid = new Kid("蝙蝠侠", 30);
		redisTemplate.opsForValue().set(kid.getUsername(), kid);
		
		kid = new Kid("蜘蛛侠", 40);
		redisTemplate.opsForValue().set(kid.getUsername(), kid);
		
		Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
		Assert.assertEquals(20, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
		Assert.assertEquals(20, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());
	}
}
