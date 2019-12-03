package Basics_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		alEmp.add(new Employee("JOHN", 25, "DEVELOPER"));
		alEmp.add(new Employee("ROLAND", 34, "ADMIN"));

		for (Employee e : alEmp) {

			System.out.println(e.eName + " " + e.eAge + " " + e.eDept);
		}

		System.out.println("***********************************");

		for (int i = 0; i < alEmp.size(); i++) {

			System.out.println(alEmp.get(i).eName + " " + alEmp.get(i).eAge + " " + alEmp.get(i).eDept);
		}
		
		System.out.println("***********************************");
		
		Iterator<Employee> itr = alEmp.iterator();
		
		while(itr.hasNext()) {
			
			Employee emp = itr.next();
			
			System.out.println(emp.eName +" "+emp.eAge+" "+emp.eDept);
		}
	}

}
