package com.random.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.random.domain.UcColumn;

/**
 * @description 服务层接口.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */
@Service
public interface UcColumnService {
	
	JSONObject addColumn(Map<String, Object> map);
	
	JSONObject deleteColumn(String columnNo);
	
	JSONObject updateColumn(Map<String, Object> map);
	
	List<UcColumn> getAllColumn();
	
	UcColumn getAColumn(String columnNO);
	
	List<UcColumn> getColumnList(Map<String, Object> map);
}
