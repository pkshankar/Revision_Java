package Basics_Java;

public class StringReverse {

	public static void main(String[] args) {

		String str = "ROLAND IS AN AMERICAN";
		String strRev = "";
		int strLength = str.length();
		for (int i = strLength - 1; i >= 0; i--) {

			strRev = strRev + str.charAt(i);
		}
		System.out.println("ORIGINAL STRING : " + str);
		System.out.println("ORIGINAL STRING : " + strRev);
	}

}
