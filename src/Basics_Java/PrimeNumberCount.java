package Basics_Java;

public class PrimeNumberCount {

	static int counter = 0;

	public static void main(String[] args) {

		//System.out.println(countPrime(20));
		countPrime(908);

	}

	public static int countPrime(int upperBound) {

		for (int i = 2; i <= upperBound; i++) {

			if (isPrime(i))
				System.out.println(i);
				counter++;

		}
		return counter;
	}

	public static boolean isPrime(int num) {

		for (int j = 2; j < num; j++) {

			if (num % j == 0) {

				return false;
			}
		}
		return true;
	}

}
