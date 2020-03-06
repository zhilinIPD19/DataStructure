package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

	static int sherlockAndAnagrams1(String s) {
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			List<String> subStrings = new ArrayList<String>();
			for (int j = 0; i + j <= s.length(); j++) {
				subStrings.add(s.substring(j, i + j));
			}

			for (int k = 0; k < subStrings.size() - 1; k++) {
				for (int l = k + 1; l < subStrings.size(); l++) {
					if (isAnagrams(subStrings.get(k), subStrings.get(l)))
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

	static boolean isAnagrams(String str1, String str2) {
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		for (int i = 0; i < chars2.length; i++) {
			if (chars1[i] != chars2[i])
				return false;
		}
		return true;
	}

	// Complete the countTriplets function below.
	static long countTriplets1(List<Long> arr, long r) {
		long count = 0;
		int size = arr.size();
		if (size < 3)
			return 0;
		for (int i = 0; i < size - 2; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				for (int k = j + 1; k < size; k++) {
					if (arr.get(i) * r == arr.get(j) && arr.get(j) * r == arr.get(k))
						count++;
				}
			}

		}
		return count;
	}

	static long countTriplets(List<Long> arr, long r) {
		long countTriplets = 0;
		Map<Long, Long> map = new HashMap<>();
		Map<Long, Long> resultMap = new HashMap<>();
		for (long num : arr) {

			if (num % r == 0) {
				long previous = num / r;
				Long countPro = resultMap.get(previous);
				if (countPro != null)
					countTriplets += countPro;

				Long countMap = map.get(previous);
				if (countMap != null)
					resultMap.put(num, resultMap.getOrDefault(num, 0L) + countMap);
			}
			map.put(num, map.getOrDefault(num, 0L) + 1);
		}
		return countTriplets;
	}

	static List<Integer> freqQuery(List<List<Integer>> queries) {
		List<Integer> freqQuery = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < queries.size(); i++) {
			Integer num = queries.get(i).get(1);
			switch (queries.get(i).get(0)) {
			case 1:
				map.put(num, map.getOrDefault(num, 0) + 1);
				break;
			case 2:
				if (map.containsKey(num)) {
					map.put(num, map.get(num) - 1);
				}
				break;
			case 3:
				if (map.containsValue(queries.get(i).get(1))) {
					freqQuery.add(1);
					break;
				} else {
					freqQuery.add(0);
					break;
				}
			}
		}
		return freqQuery;
	}

	static int maximumToys(int[] prices, int k) {

		List<Integer> priceList = Arrays.stream(prices).boxed().collect(Collectors.toList());
		System.out.println(priceList);
		Collections.sort(priceList);
		System.out.println(priceList);
		int index = 0;
		int sum = 0;
		while (sum <= k) {
			sum += priceList.get(index);
			index++;
		}
		return index - 1;

	}

	// 2 ,3 ,4, 2 ,3, 6, 8, 4 ,5
	static int activityNotifications1(int[] expenditure, int d) {
		int count = 0;
		int twoTimesMedian = 0;
		for (int i = d; i < expenditure.length; i++) {
			// get median
			List<Integer> expList = new ArrayList<Integer>();
			for (int j = i - d; j < i; j++) {
				expList.add(expenditure[j]);
			}
			Collections.sort(expList);
			System.out.println(expList);
			if (d % 2 == 0) {
				twoTimesMedian = expList.get(d / 2) + expList.get(d / 2 - 1);
			} else {
				twoTimesMedian = expList.get(d / 2) * 2;
			}
			if (expenditure[i] >= twoTimesMedian) {
				count++;
			}
		}
		return count;
	}

	static int activityNotifications(int[] expenditure, int d) {
		int countNotifs = 0;
		int twoTimesMedian = 0;
		int[] arr = new int[201];
		int j = d;
		int arrIndex = 0;
		for (int k = 0; k < d; k++) {
			arrIndex = expenditure[k];
			arr[arrIndex]++;

		}

		for (; j < expenditure.length; j++) {
			int next = expenditure[j];
			twoTimesMedian = findTwoTimesMedian(d, arr);

			if (next >= twoTimesMedian) {
				countNotifs++;
			}
			System.out.println(countNotifs);
			arr[expenditure[j - d]]--;
			arr[expenditure[j]]++;
		}

		return countNotifs;
	}

	static int findTwoTimesMedian(int d, int[] arr) {
		int count = d / 2;
		int l = 0;
		int twoTimesMedian = 0;
		while (count > 0) {
			count -= arr[l];
			l++;
		}
		l--;
		if (count < 0) {

			twoTimesMedian = l * 2;

		}
		if (count == 0) {
			int o = l + 1;
			while (arr[o] == 0) {
				o++;
			}
			if (d % 2 != 0) {
				twoTimesMedian = o * 2;
			}
			if (d % 2 == 0) {
				twoTimesMedian = l + o;
			}

		}
		return twoTimesMedian;
	}

	public static void main(String[] args) {
		String str = "abs abc abc abd abs";
		// countOccurrencesOfWords(str);
		String[] str1 = { "two", "times", "three", "is", "not", "four" };
		String[] str2 = { "two", "times", "two", "is", "four" };
		// checkMagazine(str1,str2);
		String str3 = "ifailuhkqq";
		String str4 = "kkkk";
		// System.err.println(sherlockAndAnagrams1(str3));
		// System.err.println(sherlockAndAnagrams1(str4));
		List<Long> arr5 = new ArrayList<Long>();
		arr5.add(1l);
		arr5.add(2l);
		arr5.add(2l);
		arr5.add(4l);
		// System.out.println( countTriplets(arr5,2));
		int[] arr6 = { 1, 12, 5, 111, 200, 1000, 10 };
		System.out.println();
		// System.out.println(maximumToys(arr6,50));
		// System.out.println((float)(2+5)/2);
		int[] arr7 = { 10, 20, 30, 40, 50 };
//		System.out.println(activityNotifications(arr7,3));
		// int[] arr8 = {0,0,2,2,1};
		// System.out.println(findTwoTimesMedian(3,arr8));
	}
}
