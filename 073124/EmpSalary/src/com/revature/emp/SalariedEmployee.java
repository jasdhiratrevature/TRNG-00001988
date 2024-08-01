package com.revature.emp;

public class SalariedEmployee extends Employee implements EmpBenifits{


public double calculateSalary(int present) {
	return 2000*present;
}

@Override
public String getBenifits() {
	// TODO Auto-generated method stub
	return "Medical, Food Coupons, Transport";
}
}
