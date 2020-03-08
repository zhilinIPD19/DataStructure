package hankerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivityNotifications {
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
		int[] arr7 = { 10, 20, 30, 40, 50 };
		System.out.println(activityNotifications(arr7,3));
		int[] arr8 = {0,0,2,2,1};
		 System.out.println(findTwoTimesMedian(3,arr8));
	
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


}
