package com.random.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.random.service.AsyncTask;

/**
 * @description 自定义线程池 异步调用测试类.
 * @author random
 * @version 1.0
 * @date 2018年8月10日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskTest2 {	
	@Autowired
	private AsyncTask task;
	@Test
	public void test() throws Exception{
		
		task.doTaskOne();
		task.doTaskTwo();
		task.doTaskThree();
		
		Thread.currentThread().join();
	}
}
