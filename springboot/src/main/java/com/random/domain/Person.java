package com.random.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @description 对应数据库中的Person表 使用Spring-data-jpa让数据访问更简单、更优雅.
 * @author random
 * @version 1.0
 * @date 2018年8月8日
 * 
 */
@Entity
public class Person{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false,length=5)
	private String name;
	
	@Column(nullable=false)
	private Integer age;
	
	public Person() {
		super();
	}
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
