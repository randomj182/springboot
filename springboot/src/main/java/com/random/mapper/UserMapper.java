package com.random.mapper;

import com.random.domain.User;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
// mybatis注解方式
@Mapper
public interface UserMapper {
    
	@Delete("delete * from user where user_id=#{userId}")
	public int deleteByPrimaryKey(Integer userId);

	@Insert("insert into user(user_id,username,password,type,teacher_id,stu_id) "
			+ "VALUES(#{userId},#{username},#{password},#{type},#{teacherId},#{stuId})")
	public int insert(User record);

	@Select("select user_id, username, password, type, teacher_id, stu_id from user where user_id = #{userId}")
	public User selectByPrimaryKey(Integer userId);

	@Select("select user_id, username, password, type, teacher_id, stu_id from user")
	public List<User> selectAll();

	@Update("update user set username=#{username},password=#{password},type=#{type},"
			+ "teacher_id=#{teacherId},stu_id=#{stuId} where user_id=#{userId}")
	public int updateByPrimaryKey(User record);
}