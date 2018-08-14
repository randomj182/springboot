package com.random.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.random.service.AsyncTask;

/**
 * @description 使用@Async实现异步调用：ThreadPoolTaskScheduler线程池的优雅关闭.
 * @author random
 * @version 1.0
 * @date 2018年8月10日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskTest3 {	
	@Autowired
	private AsyncTask task;
	@Test
	public void test() throws Exception{
		try {
			for(int i=0;i<300;i++){
				task.doTaskOne();
				task.doTaskTwo();
				task.doTaskThree();
				if(i==299){
					System.exit(0);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
