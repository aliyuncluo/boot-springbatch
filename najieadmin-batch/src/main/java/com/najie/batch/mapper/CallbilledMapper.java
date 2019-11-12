package com.najie.batch.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * @desc 获取话单
 * @author admin
 *
 */
@Mapper
public interface CallbilledMapper {

	/**
	 * @desc 查询话单列表
	 * @return
	 */
	List<Map<String,Object>> queryCallbilledList();
	
	int updateAmaflagsStatus();
}
