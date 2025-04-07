package com.trivium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// unit testing code for calculator
class CalculatorTest {
	
//	@Test
//	void testAdd() {
//		Calculator calculator = new Calculator();
//		int result = calculator.add(2, 3);
//		assertEquals(5, result);
//	}
//	
//	@Test
//	void testSubtract() {
//		Calculator calculator = new Calculator();
//		int result = calculator.subtract(6, 3);
//		assertEquals(3, result);
//	}
	
//	@Test
//	void testMultiply() {
//		Calculator calculator = new Calculator();
//		int result = calculator.multiply(3, 3);
//		assertEquals(9, result);
//	}

	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(25, 5);
		assertEquals(5, result);
	}

}
