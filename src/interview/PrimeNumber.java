package interview;

/**
*
*khaitq on 25 févr. 2018
*/

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCheckPrimeNumberResult(503);
		
		printAllPrimeNumber(100);
	}
	
	private static void printCheckPrimeNumberResult(int n) {
		boolean result = isPrimeNumber(n);
		System.out.println(n + " is " + (!result ? "not" : "") + " prime number");
	}
	/* 
	 * Check a number is a prime
	 */ 
	private static boolean isPrimeNumber(int n) {
		
		int sqrtValue =  (int) Math.sqrt(n);
		for (int i = 2; i<= sqrtValue; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	/*
	 * A stupid way
	 */
	private static void printAllPrimeNumber(int n) {
		for (int i = 2; i < n; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

}


