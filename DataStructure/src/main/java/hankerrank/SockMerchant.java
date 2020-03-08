package hankerrank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
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

}
