package Basics_Java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		list.add("SELENIUM");
		list.add("JAVA");
		list.add("AUTOMATION");
		Enumeration<String> en = list.elements();
		while(en.hasMoreElements()) {
			
			System.out.println(en.nextElement());
		}

	}

}
