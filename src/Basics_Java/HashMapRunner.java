package Basics_Java;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {

	public static void main(String[] args) {
		
		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("Sam", new Employee("John", 27, "Admin"));
		map.put("Dinto", new Employee("Peter", 30, "Developer"));
		
		//System.out.println(map.get("Sam").eDept);
		
		for(Map.Entry<String, Employee> m : map.entrySet()) {
			
			System.out.println(m.getKey() +" - "+m.getValue().eName);
		}

	}

}
