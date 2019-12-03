package Basics_Java;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateWords {

	public static void main(String[] args) {

		System.out.println(duplicateWords("Hey java is java best language is java taekwondo in nepal is taekwondo"));
	}

	public static Set<String> duplicateWords(String str) {

		String[] splitStr = str.split(" ");
		Set<String> setAll = new HashSet<String>();
		Set<String> setDup = new HashSet<String>();
		for (int i = 0; i < splitStr.length; i++) {
			if (!setAll.add(splitStr[i])) {

				setDup.add(splitStr[i]);
			}

		}
		return setDup;
	}

}
