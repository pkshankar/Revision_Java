package Basics_Java;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	static int counter = 1;

	public static void main(String[] args) {

		// String str = "Hey python is not java nut best language is python not java";
		String str = "100 100  200 100 200";
		Map<String, Integer> dMap = duplicateWords(str);
		for (Map.Entry<String, Integer> entry : dMap.entrySet()) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

	public static Map<String, Integer> duplicateWords(String str) {

		String[] wordArray = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < wordArray.length; i++) {

			if (!map.containsKey(wordArray[i])) {

				map.put(wordArray[i], 1);
			}

			else {

				map.put(wordArray[i], map.get(wordArray[i]) + 1);
			}
		}
		return map;
	}

}
