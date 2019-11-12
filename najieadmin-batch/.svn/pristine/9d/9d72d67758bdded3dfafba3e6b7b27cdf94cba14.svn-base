package com.najie.batch.processor;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CallbilledProcessor implements ItemProcessor<Map<String, Object>, Map<String, Object>>{
    private Logger logger = LoggerFactory.getLogger(CallbilledProcessor.class);
	@Override
	public Map<String, Object> process(Map<String, Object> item) throws Exception {
		logger.info("进入到CallbilledProcessor...");
		//List<Map<String,Object>> list = (List<Map<String,Object>>)item.get("record");
		//logger.info("转换后列表的大小为："+list.size());
		
		return item;
	}

}
