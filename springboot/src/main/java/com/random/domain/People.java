package com.random.domain;
/**
 * @description 要存储的People实体.
 * @author random
 * @version 1.0
 * @date 2018年8月7日
 * 
 */
public class People {
    private Long id;

    private String username;
    private Integer age;

    public People(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "People [id=" + id + ", username=" + username + ", age=" + age + "]";
	}

}
