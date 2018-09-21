package com.random.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.random.domain.UcTag;

/**
 * @description 数据库操作mapper类.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */
@Mapper
public interface UcTagMapper {
	void addTag(Map<String, Object> map) throws Exception;
	
	void updateTag(Map<String, Object> map) throws Exception;
	
	List<UcTag> selectAll() throws Exception;
	
	
}
