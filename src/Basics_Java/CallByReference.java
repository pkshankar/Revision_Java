package Basics_Java;

public class CallByReference {
	
	int a=20;
	int b=30;

	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		obj.sum(obj);
		System.out.println(obj.a);
	}
	
	public void sum(CallByReference ob) {
		
		//System.out.println(ob.a);
		//System.out.println(ob.b);
		ob.a=50;
		ob.b=60;
		
	}

}
