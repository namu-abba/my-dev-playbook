package com.nol2.demo.log.service;

import org.springframework.stereotype.Service;

import com.nol2.demo.log.aspect.DurationLog;

@Service
public class SampleService {
	@DurationLog("SampleService.sampleMethod1 실행시간")
	public void sampleMethod1() {
		System.out.println("SampleService.sampleMethod1() called");
		this.sampleMethod2();
	}

	public void sampleMethod2() {
		System.out.println("SampleService.sampleMethod2() called");
	}

}
