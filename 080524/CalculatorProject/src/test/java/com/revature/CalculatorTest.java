package com.revature;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import com.revatrure.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	static Calculator calculator=null;
	int input1=0;
	int input2=0;
	int result=0;
	@Test
	@DisplayName("Positive Case to add two numbers")
	@Order(2)
	public void testSumPositive() {
		// Arrange
			
		// Act
		result=calculator.sum(input1, input2);
				// Assert 
		Assertions.assertEquals(20, result);
	}
	@Test
	//@Disabled
	@Order(1)
	public void testSumNegative() {
		// Arrange
					
		System.out.println("Negative");
		// Act
		result=calculator.sum(input1, input2);
		
		// Assert 
		Assertions.assertEquals(10, result);
	}
	
	@BeforeEach
	public void beforeEachMethod() {
		input1=10;
		input2=10;
		
	}

	@AfterEach
	public void afterEachMethod() {
		result=0;
	}

	@BeforeAll
	public static void beforeAll() {
		calculator=new Calculator();
	}
	
	@AfterAll
	public static void afterAll() {
	calculator=null;
	}
}
