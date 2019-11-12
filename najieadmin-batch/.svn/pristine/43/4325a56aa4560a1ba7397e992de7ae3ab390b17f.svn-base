package com.najie.batch.writer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.najie.batch.mapper.CallbilledMapper;

@Component
public class CallbilledItemWriter implements ItemWriter<Map<String,Object>>{
	
    private Logger logger=LoggerFactory.getLogger(CallbilledItemWriter.class);
    
	@Autowired
	private CallbilledMapper callbilledMapper;
	@Override
	public void write(List<? extends Map<String, Object>> items) throws Exception {
		logger.info("进入到CallbilledItemWriter中...,items="+items);
		Map<String, Object> itemMap = items.get(0);
		if(itemMap!=null && itemMap.size()>0) {
			List<Map<String,Object>> recordList =(List<Map<String,Object>>) itemMap.get("record");
			for(Map<String,Object> map : recordList) {
				
			}	
			logger.info("批处理记录已经插入！");
		}
		
	}

}
