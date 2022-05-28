package PrimeNumberChecker;

public class PrimeNumberChecker {
	public static boolean isPrimeNumber(int number) {
		if(number == 0)
			return false;
		
		int naturalNumber = Math.abs(number);
		return isNaturalNumberPrime(naturalNumber);
	}

	public static boolean isNaturalNumberPrime(int naturalNumber) {
		assert naturalNumber > 0 : "The number must be natural";
		
		if(naturalNumber == 1) {
			return false;
		}
			
		int floorSqrtNaturalNumber = (int) Math.sqrt(naturalNumber);

		for (int i = 2; i < floorSqrtNaturalNumber; i++)
			if (isDivisible(naturalNumber, i))
				return false;

		return true;
	}

	public static boolean isDivisible(int dividend, int divider) {
		return dividend % divider == 0;
	}
}
