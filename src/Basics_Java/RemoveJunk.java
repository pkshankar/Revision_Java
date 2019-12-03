package Basics_Java;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String str = "SH@#A*90N34^&K!@A#R)(0+@#$!";
		String strWithoutJunk="";
		strWithoutJunk = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("WITH JUNK : " + str);
		System.out.println("WITHOUT JUNK : " + strWithoutJunk);
		

	}

}
