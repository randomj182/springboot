package com.random.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.random.service.UcTagService;

/**
 * @description 控制层.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */
@RestController
public class UcTagController {
	@Autowired
	public UcTagService ucTagService;
	@RequestMapping(value="/updateTag",method=RequestMethod.POST)
	public JSONObject UpdateTag(Map<String, Object> map) throws Exception{
		return ucTagService.updateTag(map);
	}
	@RequestMapping(value="/addTag",method=RequestMethod.POST)
	public JSONObject addTag(Map<String, Object> map) throws Exception{
		return ucTagService.addTag(map);
	}
}
