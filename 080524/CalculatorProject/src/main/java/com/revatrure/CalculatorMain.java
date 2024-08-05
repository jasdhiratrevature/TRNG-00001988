package com.revatrure;

public class CalculatorMain {
public static void main(String[] args) {
	Calculator calculator=new Calculator();
	int result=calculator.sum(10, 20);
	System.out.println("Sum is :: "+result);
}
}
