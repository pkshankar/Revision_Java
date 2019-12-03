package Basics_Java;

public class ArmstrongNumber {

	static int sum = 0;

	public static void main(String[] args) {

		if (isArmstrong(9474)) {

			System.out.println("IS AN ARMSTRONG NUMBER");
		}

		else {

			System.out.println("NOT AN ARMSTRONG NUMBER");
		}
	}

	public static boolean isArmstrong(int num) {

		String numStr = String.valueOf(num);
		int length = numStr.length();
		for (int i = 0; i < length; i++) {

			sum = (int) (sum + Math.pow(Character.getNumericValue(numStr.charAt(i)), length));
		}

		if (sum == num) {

			return true;
		}

		else {

			return false;
		}

	}

}
