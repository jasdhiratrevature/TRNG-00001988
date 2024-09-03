package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	/*
	 * TennisCoach tennisCoach=new TennisCoach();
	 * System.out.println(tennisCoach.getDailyWorkout());
	 */
	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
	TennisCoach tennisObj= context.getBean("tennisCoach",TennisCoach.class);
	System.out.println(tennisObj.getDailyWorkout());
	
}
}
