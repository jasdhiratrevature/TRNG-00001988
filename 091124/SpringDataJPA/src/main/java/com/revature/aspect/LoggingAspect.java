package com.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.revature.controllers.EmployeeController.get*(..))")
	public void doSomeBeforeLogging(JoinPoint joinPoint) {
		logger.info("Before Execution of "+joinPoint);
	}
	@AfterReturning(value="execution(* com.revature.controllers.EmployeeController.get*(..))",returning = "result")
	public void doAfterReturning(JoinPoint joinPoint,Object result) {
		logger.info("Before Execution of "+joinPoint);
		logger.info(result.toString());
	}
	
	@Around("execution(* com.revature.controllers.EmployeeController.get*(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();

		Object object=joinPoint.proceed();

		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
		return object;
	}
	
}
