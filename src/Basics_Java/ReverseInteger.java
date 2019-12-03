package Basics_Java;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 1001;
		String strNum = String.valueOf(num);
		String strNumRev="";
		int strNumLength = strNum.length();
		for(int i=strNumLength-1; i>=0; i--) {
			
			strNumRev = strNumRev+strNum.charAt(i);
		}
		
		int revNum = Integer.parseInt(strNumRev);
		
		if(num == revNum) {
			
			System.out.println(num + " IS A PALINDROME");
		}
		else {
			
			System.out.println(num + " IS NOT A PALINDROME");
		}
				
//		System.out.println("ORIGINAL NUMBER : " + num);
//		System.out.println("REVERSED NUMBER : " + revNum);

	}

}
