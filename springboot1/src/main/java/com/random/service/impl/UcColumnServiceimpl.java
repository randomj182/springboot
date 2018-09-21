package com.random.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.random.domain.UcColumn;
import com.random.mapper.UcColumnMapper;
import com.random.service.UcColumnService;

/**
 * @description 接口实现类.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */
@Service
public class UcColumnServiceimpl implements UcColumnService{
	@Autowired
	private UcColumnMapper ucColumnMapper;
	@Override
	public JSONObject addColumn(Map<String, Object> map) {
		JSONObject retJson = new JSONObject();
		if(ucColumnMapper.getAColumn(map.get("columnNo").toString())!=null){
			retJson.put("message", "该栏目已存在");
			return retJson;
		}
		ucColumnMapper.addColumn(map);
		return retJson;
	}

	@Override
	public JSONObject deleteColumn(String columnNo) {
		JSONObject retJson = new JSONObject();
		ucColumnMapper.deleteColumn(columnNo);
		retJson.put("message", "删除成功");
		return retJson;
	}

	@Override
	public UcColumn getAColumn(String columnNo) {
		return ucColumnMapper.getAColumn(columnNo);
	}

	@Override
	public JSONObject updateColumn(Map<String, Object> map) {
		JSONObject retJson = new JSONObject();
		ucColumnMapper.updateColumn(map);
		retJson.put("message", "更新成功");
		return retJson;
	}

	@Override
	public List<UcColumn> getAllColumn() {
		return ucColumnMapper.getAllColumn();
	}

	@Override
	public List<UcColumn> getColumnList(Map<String, Object> map) {
		return ucColumnMapper.getColumnList(map);
	}
	
}
