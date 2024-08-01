package com.revature.emp;

public class EmpSalary {
public static void main(String[] args) {
	
	SalariedEmployee se=new SalariedEmployee();
	se.setEmpId(101);
	se.setEmpName("Ashmit");
	se.setDaysPresent(20);
	System.out.println(se);
	System.out.println(se.calculateSalary(se.getDaysPresent()));
	System.out.println(se.getBenifits());
	
	ContractualEmployee ce=new ContractualEmployee(202,"Vilas",120);
	System.out.println(ce);
	System.out.println(ce.calculateSalary(ce.getDaysPresent()));
	
	/*
	 * Employee e=new Employee(303, "Sanskruti", 3000); System.out.println(e);
	 */
	
}
}
