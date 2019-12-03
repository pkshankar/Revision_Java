package Basics_Java;

public class SwapStrings {

	public static void main(String[] args) {
		
		String str1 = "Hello is in yui";
		String str2 = "world no is curate";
		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length()-str2.length()); //Hello
		str1 = str1.substring(str2.length());
		System.out.println("str1 : " +str1);
		System.out.println("str2 : " +str2);
				

	}

}
