package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
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
	  static int sherlockAndAnagrams1(String s) {
		 int count = 0;
		 
		 for (int i = 1; i < s.length(); i++) {
			 List<String> subStrings = new ArrayList<String>();
			 for (int j = 0 ; i+j <= s.length(); j++) {
				subStrings.add(s.substring(j,i+j));				 
				}
				
		 System.out.println(subStrings.toString());
		 for (int k = 0; k < subStrings.size(); k++) {
			 for (int l =k+1; l < subStrings.size(); l++) {
				if(isAnagrams(subStrings.get(i),subStrings.get(l)))
				count++;
			 }
		 	}
		 }
		 return count;
	    }
	  static int sherlockAndAnagrams(String s) {
	        int cnt = 0;
	        for (int i = 1, n = s.length(); i < n; i++) {
	            List<String> subsetList = new ArrayList<>();
	            for (int j = 0; j < n; j++) {
	                if (i + j <= n) {
	                    subsetList.add(s.substring(j, i + j));
	                }
	           

	            for (int k = 0, size = subsetList.size(); k < size; k++) {
	                for (int l = k + 1; l < size; l++) {
	                    if (isAnagrams(subsetList.get(k), subsetList.get(l))) {
	                        cnt++;
	                    }
	                }
	            }
	            }
	            System.out.println(subsetList.toString());
	        }
	            


	        return cnt;
	    }
	  static boolean isAnagrams(String str1,String str2) {
		  if(str1.length() != str2.length())
			  return false;
		  char[] chars1 = str1.toCharArray();
		  char[] chars2 = str2.toCharArray();		  
		  Arrays.sort(chars1);
		  Arrays.sort(chars2);
		  for (int i = 0; i < chars2.length; i++) {
			if(chars1[i] != chars2[i])		
			  return false;
		  }
		  return true;
	  }

	public static void main(String[] args) {
		String str = "abs abc abc abd abs";
		countOccurrencesOfWords(str);
		String[] str1 = {"two","times","three","is","not","four"};
		String[] str2 = {"two","times","two","is","four"};
		checkMagazine(str1,str2);
		String str3 = "ifailuhkqq";
		String str4 = "kkkk";
		System.err.println(sherlockAndAnagrams1(str4));
	}
}
