package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach {
	@Autowired
	HappyFortuneService happyFortuneService;
	
	
	/*
	 * @Autowired public TennisCoach(HappyFortuneService happyFortuneService) {
	 * super(); this.happyFortuneService = happyFortuneService; }
	 */


public String getDailyWorkout() {
	System.out.println(happyFortuneService.getFortune());
	return "Practice Serving ...";
}

/*
 * @Autowired public void setHappyFortuneService(HappyFortuneService
 * happyFortuneService) { this.happyFortuneService = happyFortuneService; }
 */
}
