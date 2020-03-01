package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> occurances = new HashMap<Integer, Integer>();
		int pairs = 0;
		for (int num : ar) {

			if (!occurances.containsKey(num)) {

				occurances.put(num, 1);
			}

			else
				occurances.put(num, (occurances.get(num) + 1));
		}
		Object[] arr = occurances.values().toArray();
		for (int i = 0; i < arr.length; i++) {
			pairs += (int) arr[i] / 2;
		}

		return pairs;
	}

	static int hourglassSum(int[][] arr) {
		int[] sums = new int[(arr.length - 2) * (arr.length - 2)];
		int j = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int k = 0; k < arr.length - 2; k++) {
				sums[j++] = arr[i][k] + arr[i][k + 1] + arr[i][k + 2] + arr[i + 1][k + 1] + arr[i + 2][k]
						+ arr[i + 2][k + 1] + arr[i + 2][k + 2];
			}
		}
		int maxSum = sums[0];
		for (int i = 1; i < sums.length; i++) {
			if (maxSum < sums[i]) {
				maxSum = sums[i];
			}
		}
		return maxSum;
	}

	static void checkMagazine(String[] magazine, String[] note) {

		Map<String, Integer> magazineWords = mapWords(magazine);
		Map<String, Integer> noteWords = mapWords(note);
		int i= 0;
		while(i < note.length) {
			if((magazineWords.containsKey(note[i])&& magazineWords.get(note[i]) < noteWords.get(note[i]))||!magazineWords.containsKey(note[i])) {
				System.out.println("No");
				break;
				}
			i++;
		}
		if(i == note.length) {
			System.out.println("Yes");
		}		
	}

	static Map<String, Integer> mapWords(String[] ar) {

		Map<String, Integer> words = new HashMap<String, Integer>();
		for (String word : ar) {
			if (!words.containsKey(word)) {
				words.put(word, 1);
			}
			else
				words.put(word, (words.get(word) + 1));
		}
		return words;
	}
	static String twoStrings(String s1, String s2) {
        
		Map<Character, Integer> letters1 = mapWords(s1);
		String result = "";
		int i= 0;
		while(i < s2.length()) {
			if(letters1.containsKey(s2.charAt(i))) {
				result = "YES";
				break;
				}
			i++;
		}
		if(i==s2.length())
			result = "NO";
		return result;			
    }
	static Map<Character, Integer> mapWords(String str) {

		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {		
			if (!letters.containsKey(str.charAt(i))) {
				letters.put(str.charAt(i), 1);
			}
			else
				letters.put(str.charAt(i), (letters.get(str.charAt(i)) + 1));
		}
		return letters;
	}
	  static int sherlockAndAnagrams(String s) {
		 int count = 0;
		 List<Map<Character, Integer>> subStrings = new ArrayList<Map<Character, Integer>>();
		 for (int i = 0; i < s.length(); i++) {
			 for (int j =i+ 1;j < s.length(); j++) {
				subStrings.add(mapWords(s.substring(i,j)));				 
				}
			}			
		 for (int i = 0; i < subStrings.size()-1; i++) {
			 for(int j = 1; j < subStrings.size(); j++) {
				 if(subStrings.get(i).equals(subStrings.get(j))){
					 count++;
				 }
			 }
		 }
		 return count;
	    }

	public static void main(String[] args) {
		String str = "abs abc abc abd abs";
		countOccurrencesOfWords(str);
		String[] str1 = {"two","times","three","is","not","four"};
		String[] str2 = {"two","times","two","is","four"};
		checkMagazine(str1,str2);
		String str3 = "ifailuhkqq";
		System.err.println(sherlockAndAnagrams(str3));
	}
}
