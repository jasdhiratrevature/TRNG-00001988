package com.revature.emp;

public class ContractualEmployee extends Employee{

public ContractualEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractualEmployee(int empId, String empName, int daysPresent) {
		super(empId, empName, daysPresent);
		// TODO Auto-generated constructor stub
	}

public double calculateSalary(int hours) {
	return 200*hours;
}

}
