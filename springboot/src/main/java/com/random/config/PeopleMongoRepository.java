package com.random.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.random.domain.People;

/**
 * @description 实现People的数据访问对象.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public interface PeopleMongoRepository extends MongoRepository<People, Long> {

    People findByUsername(String username);

}