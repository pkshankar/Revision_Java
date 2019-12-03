package Basics_Java;

public class LargestNumber {

	public static void main(String[] args) {
		
		int num1 = 400, num2 = 2000, num3 = 13000;
		
		if(num1 > num2 && num1 > num3) {
			
			System.out.println("LARGEST NUMTBER : " + num1);
		}
		
		else if(num2 > num3) {
			
			System.out.println("LARGEST NUMTBER : " + num2);
		}
		
		else {
			
			System.out.println("LARGEST NUMTBER : " + num3);
		}
		
		

	}

}
