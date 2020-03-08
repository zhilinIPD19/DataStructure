package hankerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
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
	public static void main(String[] args) {
		List<Long> arr5 = new ArrayList<Long>();
		arr5.add(1l);
		arr5.add(2l);
		arr5.add(2l);
		arr5.add(4l);
		System.out.println( countTriplets(arr5,2));
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
}
