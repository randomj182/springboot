package com.random;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.statemachine.StateMachine;

import com.random.domain.State.Events;
import com.random.domain.State.States;

/**
 * @description 启动类主类.
 * @author random
 * @version 1.0
 * @date 2018年7月24日
 * 
 */
// @EnableCaching		// 在Spring Boot主类中增加@EnableCaching注解开启缓存功能
/*@EnableScheduling		// 启用定时任务的配置
@EnableAsync*/
@SpringBootApplication	//(exclude = MongoAutoConfiguration.class)
public class Application implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Autowired
	private StateMachine<States, Events> stateMachine;

	@Override
	public void run(String... args) throws Exception {
		stateMachine.start();
		stateMachine.sendEvent(Events.PAY);
		stateMachine.sendEvent(Events.RECEIVE);
	}
    /*@EnableAsync
    @Configuration
    class TaskPoolConfig {

        @Bean(name="taskExecutor2")
        public Executor taskExecutor() {
            ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
            executor.setCorePoolSize(10);
            executor.setMaxPoolSize(20);
            executor.setQueueCapacity(200);
            executor.setKeepAliveSeconds(60);
            executor.setThreadNamePrefix("taskExecutor-");
            executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
            return executor;
        }
        @Bean("taskExecutor3-")
        public Executor taskExecutor2(){
        	ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        	scheduler.setPoolSize(20);
        	scheduler.setThreadNamePrefix("taskExecutor2-");
        	scheduler.setWaitForTasksToCompleteOnShutdown(true);
        	scheduler.setAwaitTerminationSeconds(60);
			return scheduler;
        	
        }
    }*/
}