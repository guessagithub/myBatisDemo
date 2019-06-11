package com.hht.myBatisDemo.commonTable.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hht.myBatisDemo.commonTable.entities.CommonTableObj;

public interface CommonTableDao {
	
	public List<CommonTableObj> getCommonTables();
	
	public CommonTableObj getCommonTableById(@Param("id") String id);
	
	public int add(CommonTableObj commonTable);
	
	public int delete(String id);
	
	public int update(CommonTableObj commonTable);

}
