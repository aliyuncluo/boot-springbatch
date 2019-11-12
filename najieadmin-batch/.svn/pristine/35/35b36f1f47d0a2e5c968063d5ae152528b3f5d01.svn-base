package com.najie.batch.scheduler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.support.JobRegistryBeanPostProcessor;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.najie.batch.BatchConfig;
import com.najie.batch.JobGlobals;


@Configuration
public class CallbilledQuartzConfiguration {

	@Autowired
	private JobLauncher jobLauncher;
	@Autowired
	private JobLocator jobLocator;
	@Autowired
	private BatchConfig batchConfig;
	@Bean
	public JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor(JobRegistry jobRegistry) {
	    JobRegistryBeanPostProcessor jobRegistryBeanPostProcessor = new JobRegistryBeanPostProcessor();
	    jobRegistryBeanPostProcessor.setJobRegistry(jobRegistry);
	    return jobRegistryBeanPostProcessor;
	}
	
	@Bean
	public JobDetailFactoryBean callbilledBean() {
	    JobDetailFactoryBean factory = new JobDetailFactoryBean();
	    factory.setJobClass(QuartzJobLauncher.class);
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("jobName", JobGlobals.CALL_BILLED_JOB);
	    map.put("jobLauncher", jobLauncher);
	    map.put("jobLocator", jobLocator);
	    factory.setJobDataAsMap(map);
	    factory.setGroup("sample2_group");
	    factory.setName("sample2_job");
	    return factory;
	}
	
	/**
	 * 每2分钟开始执行一次
	 * @return
	 */
	@Bean
	public CronTriggerFactoryBean callbilledTriggerFactoryBean() {
	    CronTriggerFactoryBean stFactory = new CronTriggerFactoryBean();
	    JobDetailFactoryBean jobDetailFactoryBean=callbilledBean();
	    if(jobDetailFactoryBean !=null) {
	    	stFactory.setJobDetail(jobDetailFactoryBean.getObject());
	    }
	    stFactory.setName("cron2_trigger");
	    stFactory.setGroup("cron2_group");
	    stFactory.setMisfireInstruction(2); //每两分钟执行一次
	    stFactory.setCronExpression(batchConfig.getCron("callbilled"));
	    return stFactory;
	}
	
	@Bean
	public SchedulerFactoryBean callbilledSchedulerFactoryBean() {
	    SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
	    scheduler.setTriggers(callbilledTriggerFactoryBean().getObject());
	    return scheduler;
	}
	
	
	
}
