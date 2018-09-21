package com.random.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.random.domain.UcTag;
import com.random.mapper.UcTagMapper;
import com.random.service.UcTagService;

/**
 * @description 接口实现类.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */
@Service
public class UcTagServiceimpl implements UcTagService{
	@Autowired
	public UcTagMapper ucTagMapper;
	@Override
	public JSONObject addTag(Map<String, Object> map) throws Exception {
		JSONObject retJson = new JSONObject();
		try {
			ucTagMapper.addTag(map);
			retJson.put("message", "新增成功");
		} catch (Exception e) {
			retJson.put("message", "新增失败");
			e.printStackTrace();
		}
		return retJson;
	}

	@Override
	public JSONObject deleteTag(String tagNo) throws Exception {
		return null;
	}

	@Override
	public JSONObject updateTag(Map<String, Object> map) throws Exception {
		JSONObject jsonObject = new JSONObject();
		try {
			ucTagMapper.updateTag(map);
			System.out.println("标签修改成功");
			jsonObject.put("message", "修改成功");
		} catch (Exception e) {
			System.out.println("标签修改失败");
			e.printStackTrace();
			jsonObject.put("message", "修改失败");
		}
		return jsonObject;
	}

	@Override
	public List<UcTag> getAllTags() throws Exception {
		return ucTagMapper.selectAll();
	}

	@Override
	public List<UcTag> getListByPage(Map<String, Object> map) throws Exception {
		return null;
	}

}
