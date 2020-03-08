package hankerrank;

import java.util.HashMap;
import java.util.Map;

public class CheckMagazine {
	static void checkMagazine(String[] magazine, String[] note) {

		Map<String, Integer> magazineWords = mapWords(magazine);
		Map<String, Integer> noteWords = mapWords(note);
		int i = 0;
		while (i < note.length) {
			if ((magazineWords.containsKey(note[i]) && magazineWords.get(note[i]) < noteWords.get(note[i]))
					|| !magazineWords.containsKey(note[i])) {
				System.out.println("No");
				break;
			}
			i++;
		}
		if (i == note.length) {
			System.out.println("Yes");
		}
	}

	static Map<String, Integer> mapWords(String[] ar) {

		Map<String, Integer> words = new HashMap<String, Integer>();
		for (String word : ar) {
			if (!words.containsKey(word)) {
				words.put(word, 1);
			} else
				words.put(word, (words.get(word) + 1));
		}
		return words;
	}
	public static void main(String[] args) {
		String[] str1 = { "two", "times", "three", "is", "not", "four" };
		String[] str2 = { "two", "times", "two", "is", "four" };
	 checkMagazine(str1,str2);
	}

}
