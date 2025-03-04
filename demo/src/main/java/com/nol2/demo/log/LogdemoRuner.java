package com.nol2.demo.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nol2.demo.log.service.impl.SampleServiceImpl;

@Component
public class LogdemoRuner implements CommandLineRunner {
	@Autowired
	private SampleServiceImpl testService;

	@Override
	public void run(String... args) throws Exception {
		testService.sampleMethod1();
	}
}
