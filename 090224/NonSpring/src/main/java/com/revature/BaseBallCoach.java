package com.revature;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BaseBallCoach implements Coach{
	HappyFortuneService happy;
	
	/*
	 * public BaseBallCoach(HappyFortuneService happy) { super(); this.happy =
	 * happy; }
	 */

	public String getDailyWorkout() {
		System.out.println(happy.getDailyFortune());
		return "Run 5 kms...";
	}

	public void setHappy(HappyFortuneService happy) {
		this.happy = happy;
	}
	
	public void doSomethingAtInit() {
		System.out.println("Init method of bean.....");
	}

	public void someDestroy() {
		System.out.println("Destroy ....");
	}
}
