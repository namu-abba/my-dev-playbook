package com.nol2.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nol2.demo.log.service.SampleService;

// import lombok.extern.slf4j.Slf4j;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private SampleService testService;

	@Test
	void contextLoads() {
		System.out.println("Hello, World!");
		testService.sampleMethod1();
	}

}
