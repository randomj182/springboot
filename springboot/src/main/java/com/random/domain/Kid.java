package com.random.domain;

import java.io.Serializable;

/**
 * @description 要存储的对象kid.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public class Kid implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public Kid(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Kid [username=" + username + ", age=" + age + "]";
	}

}
