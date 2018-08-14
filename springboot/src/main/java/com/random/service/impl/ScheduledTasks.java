package com.random.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @description 使用@Scheduled创建定时任务.
 * 				需在主类上启动定时任务总开关@EnableScheduling
 * @author random
 * @version 1.0
 * @date 2018年8月10日
 * 
 */
@Component
public class ScheduledTasks {
	
	private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime(){
		System.out.println("现在时间："+dateFormat.format((Object)new Date()));
	}
}
