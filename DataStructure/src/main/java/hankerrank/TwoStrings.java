package hankerrank;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
	static String twoStrings(String s1, String s2) {

		Map<Character, Integer> letters1 = mapWords(s1);
		String result = "";
		int i = 0;
		while (i < s2.length()) {
			if (letters1.containsKey(s2.charAt(i))) {
				result = "YES";
				break;
			}
			i++;
		}
		if (i == s2.length())
			result = "NO";
		return result;
	}
	static Map<Character, Integer> mapWords(String str) {

		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!letters.containsKey(str.charAt(i))) {
				letters.put(str.charAt(i), 1);
			} else
				letters.put(str.charAt(i), (letters.get(str.charAt(i)) + 1));
		}
		return letters;
	}


}
