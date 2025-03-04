package com.nol2.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nol2.demo.log.service.impl.SampleServiceImpl;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private SampleServiceImpl testService;

	@Test
	void contextLoads() {
		testService.sampleMethod1();
	}

}
