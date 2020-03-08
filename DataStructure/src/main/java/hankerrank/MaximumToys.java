package hankerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumToys {
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
	public static void main(String[] args) {
		int[] arr6 = { 1, 12, 5, 111, 200, 1000, 10 };
		 System.out.println(maximumToys(arr6,50));
	}

}
