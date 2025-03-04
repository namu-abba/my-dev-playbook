package com.nol2.demo.log.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DurationLogAspect {
	private static final Logger logger = LoggerFactory.getLogger(DurationLogAspect.class);

	@Around("@annotation(durationLog)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint, DurationLog durationLog) throws Throwable {
		long start = System.currentTimeMillis();
		try {
			return joinPoint.proceed();
		} finally {
			long duration = System.currentTimeMillis() - start;
			logger.info("[{}] 종료 - 실행 시간: {} ms", durationLog.value(), duration);
		}
	}
}