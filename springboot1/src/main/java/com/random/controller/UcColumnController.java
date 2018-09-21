package com.random.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.random.domain.UcColumn;
import com.random.service.UcColumnService;

/**
 * @description 控制层.
 * @author random
 * @version 1.0
 * @date 2018年8月29日
 * 
 */
@RestController
@RequestMapping("am")
public class UcColumnController {
	@Autowired
	private UcColumnService ucColumnService;
	
	@RequestMapping(value="addColumn",method=RequestMethod.POST)
	public JSONObject addColumn(Map<String, Object> map){
		return ucColumnService.addColumn(map);
	}
	
	@RequestMapping(value="deleteColumn",method=RequestMethod.POST)
	public JSONObject deleteColumn(String columnNo){
		return ucColumnService.deleteColumn(columnNo);
	}
	
	@RequestMapping(value="updateColumn",method=RequestMethod.POST)
	public JSONObject updateColumn(Map<String, Object> map){
		return ucColumnService.updateColumn(map);
	}
	
	@RequestMapping(value="getAllColumn",method=RequestMethod.GET)
	public List<UcColumn> getAllColumn(){
		return ucColumnService.getAllColumn();
	}
	@RequestMapping(value="getColumnList",method=RequestMethod.POST)
	public List<UcColumn> getColumnList(Map<String, Object> map){
		return ucColumnService.getColumnList(map);
	}
}
