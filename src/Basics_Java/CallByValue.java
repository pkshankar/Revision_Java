package Basics_Java;

public class CallByValue {

	static int a = 20;
	static int b = 30;

	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		System.out.println(obj.sum(a, b));
		System.out.println(a+b);
	}

	public int sum(int num1, int num2) {
		
		num1 = 50;
		num2 = 60;

		return num1 + num2;
	}

}
