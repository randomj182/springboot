package com.random.config;

import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.random.domain.Person;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年8月8日
 * 
 */
// @CacheConfig(cacheNames = "person")
public interface PersonRepository  extends JpaRepository<Person,Long> {
	// @Cacheable
	Person findByName(String name);

	Person findByNameAndAge(String name,Integer age);
	// hql:此处的"Person" 不是表名,而且实体类名,
	@Query("FROM Person p WHERE p.name = name")
	Person findPerson(@Param("name") String name);
}
