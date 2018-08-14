package com.random.test;

import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.random.Application;
import com.random.service.AsyncTask;

/**
 * @description 异步调用测试类.
 * @author random
 * @version 1.0
 * @date 2018年8月10日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TaskTest {
	@Autowired
	private AsyncTask task;
	@Test
	public void test() throws Exception{
		Long start = System.currentTimeMillis();
		
		Future<String> task1 = task.doTaskOne();
		Future<String> task2 = task.doTaskTwo();
		Future<String> task3 = task.doTaskThree();
		
		while(true){
			if(task1.isDone()&&task2.isDone()&&task3.isDone()){
				break;
			}
			Thread.sleep(1000);
		}
		Long end = System.currentTimeMillis();
		System.out.println("一共用时:"+(end-start)+"毫秒");
	}
}
