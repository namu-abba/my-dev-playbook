package com.nol2.demo.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Timer {

	private final String methodName;
	private final long startTime;

	public Timer(String methodName) {
		this.methodName = methodName;
		this.startTime = System.currentTimeMillis();
		log.info("🟢 👉 [{}] 시작", methodName);
	}

	public void stop() {
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		log.info("🔴 👈 [{}] 종료 - 실행 시간: {} ms", methodName, elapsedTime);
	}
}
