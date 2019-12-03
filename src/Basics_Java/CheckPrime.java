package Basics_Java;

public class CheckPrime {

	public static void main(String[] args) {

		if (isPrime(426893) == true) {

			System.out.println("NUMBER IS PRIME");
		} else {

			System.out.println("NUMBER IS NOT PRIME");
		}

	}

	public static boolean isPrime(int num) {

		boolean flag = true;

		if (num <= 1) {

			return !flag;

		}

		else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					flag = false;
					break;

				}

			}
			return flag;
		}

	}

}
