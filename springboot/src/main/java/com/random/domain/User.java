package com.random.domain;

import org.springframework.stereotype.Component;
/**
 * 
 * @description 对应test数据库中的user表.
 * @author random
 * @version 1.0
 * @date 2018年7月30日
 */
@Component
public class User {
    
    private Integer userId;
    private String username;
    private String password;
    private Integer type;
    private String teacherId;
    private String stuId;
    
    public User() {
		super();
	}

	public User(Integer userId, String username, String password, Integer type, String teacherId, String stuId) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.type = type;
		this.teacherId = teacherId;
		this.stuId = stuId;
	}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", type=" + type
				+ ", teacherId=" + teacherId + ", stuId=" + stuId + "]";
	}
    
}