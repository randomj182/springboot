package com.random.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.random.domain.UcTag;

/**
 * @description 服务层接口.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */
public interface UcTagService {
	
	public JSONObject addTag(Map<String, Object> map) throws Exception;
	
	public JSONObject deleteTag(String tagNo) throws Exception;
	
	public JSONObject updateTag(Map<String, Object> map) throws Exception;
	
	public List<UcTag> getAllTags() throws Exception;
	
	public List<UcTag> getListByPage(Map<String, Object> map) throws Exception;
}
