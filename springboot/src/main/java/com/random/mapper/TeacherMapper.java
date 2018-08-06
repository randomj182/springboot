package com.random.mapper;

import com.random.domain.Teacher;
import java.util.List;

public interface TeacherMapper {
    
    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);
	
	
	
}