package Basics_Java;

public class StringOnlyDigits {

	public static void main(String[] args) {

		if (checkString1("12679$"))
			System.out.println("STRING CONTAINS ONLY DIGITS");
		else
			System.out.println("STRING DOES NOT CONTAIN ONLY DIGITS");

	}

	public static boolean checkString(String str) {

		String strNew = str.replaceAll("[0-9]", "");
		if (strNew.isEmpty())
			return true;
		else
			return false;

	}

	public static boolean checkString1(String str) {

		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isDigit(str.charAt(i)))

				flag = false;
			else
				flag = true;

		}
		return flag;
	}

}
