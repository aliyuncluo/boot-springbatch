package com.najie;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing //开启批处理
@SpringBootApplication
public class NajieadminBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(NajieadminBatchApplication.class, args);
	}

}
