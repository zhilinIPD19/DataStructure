package hashmap;

import java.util.HashMap;
import java.util.Map;


public class CountOccurrencesOfWords {

	public static void countOccurrencesOfWords(String str) {

		String[] words = str.split(" ");

		Map<String, Integer> occurances = new HashMap<String, Integer>();

		for (String word : words) {

			if (!occurances.containsKey(word)) {

				occurances.put(word, 1);
			}

			else
				occurances.put(word, (occurances.get(word) + 1));
		}

		occurances.forEach((keeeey, vaaaalue) -> System.out.println("Key = "

				+ keeeey + ", Value = " + vaaaalue));

	}
	
	public static void main(String[] args) {
		String str = "abs abc abc abd abs";
		 countOccurrencesOfWords(str);		
	}
}
