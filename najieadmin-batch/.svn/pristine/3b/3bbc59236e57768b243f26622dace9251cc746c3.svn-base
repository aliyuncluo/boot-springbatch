package com.najie.batch.reader;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.najie.batch.mapper.CallbilledMapper;

@Component
public class CallbilledItemReader implements ItemReader<Map<String,Object>>{
    private Logger logger = LoggerFactory.getLogger(CallbilledItemReader.class);
	@Autowired
	private CallbilledMapper callbilledMapper;
	
	private boolean jobEnd = false;
	@Override
	public Map<String, Object> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		logger.info("进入到CallbilledItemReader...");
		if(!jobEnd) {
			Map<String, Object> map = new HashMap<>();			
			List<Map<String,Object>> callbilledList = callbilledMapper.queryCallbilledList();
			logger.info("获取的话单列表的大小为："+callbilledList.size());
			if(!CollectionUtils.isEmpty(callbilledList)) {
				map.put("record", callbilledList);
			}
			jobEnd = true;
			return map;
		}else {
			jobEnd = false;
			return null;
		}
	}

}
