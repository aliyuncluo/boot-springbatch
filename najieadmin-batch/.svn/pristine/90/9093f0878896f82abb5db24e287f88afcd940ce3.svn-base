package com.najie.batch;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 上传配置类
 * @author 
 *
 */
@Configuration
@ConfigurationProperties(prefix = "najie.batch")
public class BatchConfig {
	private Map<String, String> cron;
    private int chunk; 
    private int pageSize;

	public String getCron(String key) {
		if(cron.containsKey(key)) {
			return cron.get(key);
		}
		return null;
	}

	public void setCron(Map<String, String> cron) {
		this.cron = cron;
	}

	public int getChunk() {
		return chunk;
	}

	public void setChunk(int chunk) {
		this.chunk = chunk;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
