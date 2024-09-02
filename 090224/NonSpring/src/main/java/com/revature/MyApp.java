package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	/*
	 * BaseBallCoach bCoach=new BaseBallCoach();
	 * System.out.println(bCoach.getDailyWorkout());
	 * 
	 * CricketCoach cCoach=new CricketCoach();
	 * System.out.println(cCoach.getDailyWorkout());
	 */
	
	// Creating Spring Container
	ClassPathXmlApplicationContext container=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
		BaseBallCoach bObj=	container.getBean("bCoach",BaseBallCoach.class);
		
		System.out.println(bObj.getDailyWorkout());
		
		container.close();
}
}
