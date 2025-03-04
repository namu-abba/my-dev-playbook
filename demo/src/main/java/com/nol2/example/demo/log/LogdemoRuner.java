package com.nol2.example.demo.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nol2.example.demo.log.service.SampleService;

@Component
public class LogdemoRuner implements CommandLineRunner {
	@Autowired
	private SampleService testService;

	@Override
	public void run(String... args) throws Exception {
		testService.sampleMethod1();
	}
}
