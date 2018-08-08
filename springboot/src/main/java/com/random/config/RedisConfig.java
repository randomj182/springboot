package com.random.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.random.domain.Kid;
import com.random.service.impl.RedisObjectSerializer;

/**
 * @description 配置针对Kid的RedisTemplate实例.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
@Configuration
public class RedisConfig {				
	@Bean
	JedisConnectionFactory jedisConnectionFactory(){
		return new JedisConnectionFactory();
	}
	@Bean
	public RedisTemplate<String, Kid> redisTemplate(RedisConnectionFactory factory){
		RedisTemplate<String, Kid> template = new RedisTemplate<String,Kid>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new RedisObjectSerializer());
		return template;
	}
}
