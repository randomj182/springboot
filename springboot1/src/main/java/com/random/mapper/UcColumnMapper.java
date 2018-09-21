package com.random.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.random.domain.UcColumn;

@Mapper
public interface UcColumnMapper{
	
	void addColumn(Map<String, Object> map);
	
	void deleteColumn(String columnNo);
	
	void updateColumn(Map<String, Object> map);
	
	List<UcColumn> getAllColumn();
	
	UcColumn getAColumn(String columnNO);
	
	List<UcColumn> getColumnList(Map<String, Object> map);
}