package com.random.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.random.domain.Teacher;

/**
 * @description Teacher对象的控制层操作.
 * @author random
 * @version 1.0
 * @date 2018年8月6日
 * 
 */
@RestController
@RequestMapping(value = "/teachers")		//通过这里配置使下面的映射都在/teachers下
public class TeacherController {
	//创建线程安全的Map
	static Map<Long, Teacher> teachers = Collections.synchronizedMap(new HashMap<Long,Teacher>());
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public List<Teacher> getTeacherList(){
		// 处理"/users/"的GET请求，用来获取用户列表 
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递 
		List<Teacher> t = new ArrayList<Teacher>(teachers.values());
		return t;
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String postTeacher(@RequestParam Teacher teacher){
		// 处理"/users/"的POST请求，用来创建User 
	    // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数 
		teachers.put(Long.parseLong(teacher.getTeacherId()), teacher);
		return "success";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String putTeacher(@PathVariable Long id,@ModelAttribute Teacher teacher){
		// 处理"/users/{id}"的PUT请求，用来更新User信息 
		Teacher t = teachers.get(id);
		t.setTeacherName(teacher.getTeacherName());
		t.setAge(teacher.getAge());
		teachers.put(id, t);
		return "success";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable Long id){
		// 处理"/users/{id}"的DELETE请求，用来删除User
		teachers.remove(id);
		return "success";
	}
}
