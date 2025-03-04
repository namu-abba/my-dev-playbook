package com.nol2.demo.log.service.impl;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.nol2.demo.log.aspect.DurationLog;
import com.nol2.demo.log.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private ApplicationContext applicationContext;

	@DurationLog("sampleMethod1 실행시간")
	public void sampleMethod1() {
		System.out.println("sampleMethod1() called");
		SampleServiceImpl self = applicationContext.getBean(SampleServiceImpl.class);
		self.sampleMethod2(); // ✅ 안전하게 프록시를 통해 호출
	}

	@DurationLog("sampleMethod2 실행시간")
	public void sampleMethod2() {
		System.out.println("sampleMethod2() called");
	}
}
