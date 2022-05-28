package PrimeNumberChecker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberCheckerTest {

	@Test
	void test0isNotPrime() {
		assertFalse(PrimeNumberChecker.isPrimeNumber(0));
	}
	
	@Test
	void test1isNotPrime() {
		assertFalse(PrimeNumberChecker.isPrimeNumber(1));
	}
	
	@Test
	void testNegative1isNotPrime() {
		assertFalse(PrimeNumberChecker.isPrimeNumber(-1));
	}
	
	@Test
	void test5isPrime() {
		assertTrue(PrimeNumberChecker.isPrimeNumber(5));
	}
	
	@Test
	void testNegative5isPrime() {
		assertTrue(PrimeNumberChecker.isPrimeNumber(-5));
	}
	
	@Test
	void test6isPrime() {
		assertTrue(PrimeNumberChecker.isPrimeNumber(5));
	}
	
	@Test
	void testNegative6isPrime() {
		assertTrue(PrimeNumberChecker.isPrimeNumber(-5));
	}

}
