package com.random.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.random.Application;
import com.random.config.PersonRepository;
import com.random.domain.Person;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年8月8日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class PersonTest {
	@Autowired
	private  PersonRepository personRepository;
	
	/*@Autowired
	private CacheManager cacheManager;*/

	@Test
	@Transactional
	public void saveAndQuery(){
		// 创建10条记录
		personRepository.save(new Person("AAA", 10));
		personRepository.save(new Person("BBB", 20));
		personRepository.save(new Person("CCC", 30));
		personRepository.save(new Person("DDD", 40));
		personRepository.save(new Person("EEE", 50));
		personRepository.save(new Person("FFF", 60));
		personRepository.save(new Person("GGG", 70));
		personRepository.save(new Person("HHH", 80));
		personRepository.save(new Person("III", 90));
		personRepository.save(new Person("JJJ", 100));

		// 测试findAll, 查询所有记录
		Assert.assertEquals(10, personRepository.findAll().size());

		// 测试findByName, 查询姓名为FFF的User
		Assert.assertEquals(60, personRepository.findByName("FFF").getAge().longValue());

		// 测试findUser, 查询姓名为FFF的User
		Assert.assertEquals(60, personRepository.findPerson("FFF").getAge().longValue());

		// 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
		Assert.assertEquals("FFF", personRepository.findByNameAndAge("FFF", 60).getName());

		// 测试删除姓名为AAA的User
		personRepository.delete(personRepository.findByName("AAA"));

		// 测试findAll, 查询所有记录, 验证上面的删除是否成功
		Assert.assertEquals(9, personRepository.findAll().size());
	}
	/*@Test
	public void test(){
		Person p1  = personRepository.findByName("AAA");
		System.out.println("第一次查询:"+p1.getAge());
		Person p2  = personRepository.findByName("AAA");
		System.out.println("第一次查询:"+p2.getAge());
	}*/
}
