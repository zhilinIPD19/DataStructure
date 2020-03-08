package hankerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndAnagrams {
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
	public static void main(String[] args) {
		String str3 = "ifailuhkqq";
		String str4 = "kkkk";
		System.err.println(sherlockAndAnagrams1(str3));
		System.err.println(sherlockAndAnagrams1(str4));
	}

}
