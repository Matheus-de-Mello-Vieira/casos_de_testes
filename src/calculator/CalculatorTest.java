package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test1and2AddictionIs3() {
		double actual = Calculator.addiction(1, 2);
		assertEquals(3, actual);
	}

	@Test
	void test0and0AddictionIs0() {
		double actual = Calculator.addiction(0, 0);
		assertEquals(0, actual);
	}
	
	@Test
	void test1and2SubtractionIsNegative1() {
		double actual = Calculator.subtraction(1, 2);
		assertEquals(-1, actual);
	}

	@Test
	void test0and0SubtractionIs0() {
		double actual = Calculator.subtraction(0, 0);
		assertEquals(0, actual);
	}
	
	@Test
	void test1and2MultiplicationIs2() {
		double actual = Calculator.multiplication(1, 2);
		assertEquals(2, actual);
	}

	@Test
	void test0and0MultiplicationIs0() {
		double actual = Calculator.multiplication(0, 0);
		assertEquals(0, actual);
	}
	
	@Test
	void test1and2DivisionIsHalf() {
		double actual = Calculator.division(1, 2);
		assertEquals(0.5, actual);
	}

	@Test
	void test0and0DivisionIsNan() {
		assertEquals(Double.NaN, Calculator.division(0, 0));
	}
}
