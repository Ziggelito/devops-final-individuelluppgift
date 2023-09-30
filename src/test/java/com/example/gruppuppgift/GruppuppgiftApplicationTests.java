package com.example.gruppuppgift;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GruppuppgiftApplicationTests {

	private Calculator calculator;
	private double d1;
	private double d2;
	private double answer;

	@BeforeEach
	public void startCalc(){
		calculator = new Calculator();
		d1 = 10;
		d2 = 5;
	}
	@AfterEach
	public void stopCalc(){
		calculator = null;
	}
	@Test
	public void testAddition(){
		answer = calculator.addition(d1,d2);
		assertEquals(15,answer);
	}
	@Test
	public void testSubtraction(){
		answer = calculator.subtraction(d1,d2);
		assertEquals(5,answer);
	}
	@Test
	public void testMultiplication(){
		answer = calculator.multiplication(d1,d2);
		assertEquals(50,answer);
	}
	@Test
	public void testDivision(){
		answer = calculator.division(d1,d2);
		assertEquals(2,answer);
	}
}
