package Basics_Java;

public class StringOnlyDigits {

	public static void main(String[] args) {

		if (checkString("89764545"))
			System.out.println("STRING CONTAINS ONLY DIGITS");
		else
			System.out.println("STRING DOES NOT CONTAIN ONLY DIGITS");

	}

	public static boolean checkString(String str) {

		boolean flag = false;
		if (!str.isEmpty()) {
			String strNew = str.replaceAll("[0-9]", "");
			if (strNew.isEmpty())
				flag = true;
			else
				flag = false;
		}

		return flag;
	}

}
