package com.ramdom.config;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.random.domain.People;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public interface PeopleRepository extends MongoRepository<People, Long> {

    People findByUsername(String username);

}