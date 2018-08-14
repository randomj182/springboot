package com.random.service;

import java.util.Random;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 * @description 使用@Async实现异步调用：自定义线程池.
 * 				为了让@Async注解能够生效,还需要在Spring Boot的主程序中自定义线程池.
 * @author random
 * @version 1.0
 * @date 2018年8月10日
 * 
 */
@Component
public class AsyncTask2 {

	private static final Random RANDOM=new Random();
	@Async("taskExecutor2")
	public void doTaskOne() throws Exception{
		System.out.println("开始做任务一");
		Long start = System.currentTimeMillis();
		Thread.sleep(RANDOM.nextInt(5000));
		Long end = System.currentTimeMillis();
		System.out.println("完成任务一,耗时:"+(end-start)+"毫秒");
	}
	@Async("taskExecutor2")
	public void doTaskTwo() throws Exception{
		System.out.println("开始做任务二");
		Long start = System.currentTimeMillis();
		Thread.sleep(RANDOM.nextInt(5000));
		Long end = System.currentTimeMillis();
		System.out.println("完成任务二,耗时:"+(end-start)+"毫秒");
	}
	@Async("taskExecutor2")
	public void doTaskThree() throws Exception{
		System.out.println("开始做任务三");
		Long start = System.currentTimeMillis();
		Thread.sleep(RANDOM.nextInt(5000));
		Long end = System.currentTimeMillis();
		System.out.println("完成任务三,耗时:"+(end-start)+"毫秒");
	}
}
