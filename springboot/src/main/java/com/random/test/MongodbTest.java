package com.random.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ramdom.Application;
import com.ramdom.config.PeopleMongoRepository;
import com.random.domain.People;

/**
 * @description Spring Boot中对MongoDB访问的配置和使用进行测试.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class MongodbTest {

	@Autowired
	private PeopleMongoRepository peopleRepository;

	@Before
	public void setUp() {
		peopleRepository.deleteAll();
	}

	@Test
	public void test() throws Exception {

		// 创建三个User，并验证User总数
		peopleRepository.save(new People(1L, "didi", 30));
		peopleRepository.save(new People(2L, "mama", 40));
		peopleRepository.save(new People(3L, "kaka", 50));
		Assert.assertEquals(3, peopleRepository.findAll().size());

		// 删除一个User，再验证User总数
		People people = peopleRepository.findOne(1L);
		peopleRepository.delete(people);
		Assert.assertEquals(2, peopleRepository.findAll().size());

		// 删除一个User，再验证User总数
		people = peopleRepository.findByUsername("mama");
		peopleRepository.delete(people);
		Assert.assertEquals(1, peopleRepository.findAll().size());

	}

}