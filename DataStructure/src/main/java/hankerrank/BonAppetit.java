package hankerrank;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {
	/*
	 * Complete the bonAppetit function in the editor below. It should print Bon
	 * Appetit if the bill is fairly split. Otherwise, it should print the integer
	 * amount of money that Brian owes Anna.
	 * 
	 * bill: an array of integers representing the cost of each item ordered 
	 * k: an integer representing the zero-based index of the item Anna doesn't eat 
	 * b: the amount of money that Anna contributed to the bill
	 * 
	 */
	static void bonAppetit(List<Integer> bill, int k, int b) {
		Integer sum = bill.stream().reduce(0, Integer::sum);
		if (b * 2 == sum - bill.get(k)) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(bill.get(k) / 2);
		}

	}
	public static void main(String[] args) {
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(10);
		bonAppetit(bill, 1, 12);
	}

}
