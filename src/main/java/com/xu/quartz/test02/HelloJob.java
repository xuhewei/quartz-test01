package com.xu.quartz.test02;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 摘自：http://blog.csdn.net/u010648555/article/details/54863394
public class HelloJob implements Job {
	private static Logger _log =  LoggerFactory.getLogger(HelloJob.class);
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// Say Hello to the World and display the date/time
		_log.info("Hello World! - " + new Date());
		System.out.println("Hello World! - " + new Date());
	}

	
}
