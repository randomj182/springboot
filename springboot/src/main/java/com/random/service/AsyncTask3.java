package com.random.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 * @description 使用@Async实现异步调用：ThreadPoolTaskScheduler线程池的优雅关闭.
 * @author random
 * @version 1.0
 * @date 2018年8月10日
 * 
 */
@Component
public class AsyncTask3 {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Async("taskExecutor3")
	public void doTaskOne() throws Exception{
		System.out.println("开始做任务一");
		Long start = System.currentTimeMillis();
		System.out.println(stringRedisTemplate.randomKey());
		Long end = System.currentTimeMillis();
		System.out.println("完成任务一,耗时:"+(end-start)+"毫秒");
	}
	@Async("taskExecutor3")
	public void doTaskTwo() throws Exception{
		System.out.println("开始做任务二");
		Long start = System.currentTimeMillis();
		System.out.println(stringRedisTemplate.randomKey());
		Long end = System.currentTimeMillis();
		System.out.println("完成任务二,耗时:"+(end-start)+"毫秒");
	}
	@Async("taskExecutor3")
	public void doTaskThree() throws Exception{
		System.out.println("开始做任务三");
		Long start = System.currentTimeMillis();
		System.out.println(stringRedisTemplate.randomKey());
		Long end = System.currentTimeMillis();
		System.out.println("完成任务三,耗时:"+(end-start)+"毫秒");
	}
}
