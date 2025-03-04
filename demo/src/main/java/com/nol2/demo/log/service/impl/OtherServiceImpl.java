package com.nol2.demo.log.service.impl;

import org.springframework.stereotype.Service;

import com.nol2.demo.log.aspect.DurationLog;

@Service
public class OtherServiceImpl {

	@DurationLog("sampleMethod2 실행시간")
	public void sampleMethod2() {
		System.out.println("SampleService.sampleMethod2() called");
	}

}
