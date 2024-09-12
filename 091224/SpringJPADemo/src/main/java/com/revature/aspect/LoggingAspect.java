package com.revature.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Pointcut("execution(* com.revature.controllers.EmployeeController.get*(..))")
	private void myPC1() {
		
	}

	//before==execute=*com.revature.controllers.EmployeeController.getEmployees()
	@Before("myPC1()")
	public void addPrintStatement(JoinPoint joinPoint) {
		logger.info(" Adivce for "+joinPoint.toString());
	}
	
	@After("myPC1()")
	public void afterAdviceDemo(JoinPoint joinPoint) {
		logger.info("After Adivce for "+joinPoint.toString());
	}
	
	@AfterReturning(pointcut = "myPC1()",returning = "result")
	public void afterReturningAdvice(Object result) {
		logger.info("After Returning Advice");
		logger.info(result.toString());
	}
	
	@AfterThrowing(pointcut ="myPC1()",throwing = "ex" )
	public void afterThrowingAdvice(Object ex) {
		logger.info("After Throwing ....");
		logger.info(ex.toString());
		
	}
	
	@Around(value = "myPC1()")
	public Object aroundAdviceDemo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime=System.currentTimeMillis();
		
		Object obj=proceedingJoinPoint.proceed();
		
		long endTime=System.currentTimeMillis();
		logger.info("Time Taken for Execution = "+(endTime-startTime));
		return obj;
	}
}
