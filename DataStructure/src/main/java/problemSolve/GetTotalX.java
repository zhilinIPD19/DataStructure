package problemSolve;

import java.util.ArrayList;
import java.util.List;


public class GetTotalX {
	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int count = 1;
		Integer max = findLargestCommonDivisorOfList(b);
		Integer min = findSmallestCommonMultipleOfList(a);
		Integer lcd = findLargestCommonDivisorOfTwoNum(min, max);		
		Integer x = max;
		while(x >= min) {			
			x /= lcd;
			count++;
		}
		return count;
	}

	public static int getTotalX1(int[] a, int[] b) {
		int count = 1;
		Integer max = findLargestCommonDivisorOfIntArray(b);
		Integer min = findSmallestCommonMultipleOfIntArray(a);
		Integer lcd = findLargestCommonDivisorOfTwoNum(min, max);		
		Integer x = max;
		while(x >= min) {			
			x /= lcd;
			count++;
		}
		return count;
	}
	public static int findLargestCommonDivisorOfList(List<Integer> arr) {		
		int len = arr.size();
		int lcd =arr.get(0);
		int swap = 0;
		for (int i = 0; i < (len - 1); i++) {				
			while (arr.get(i + 1) != 0) {
				swap = arr.get(i + 1);
				arr.add((i + 1),lcd % arr.get(i + 1));
				lcd = swap;
			}
		}
		return lcd;
	}
	public static int findSmallestCommonMultipleOfList(List<Integer> arr) {	
		int len = arr.size();
		int lcd = arr.get(0);
		int swap = 0;
		int scm = arr.get(0);
		int temp = 0;
		for (int i = 0; i < (len - 1); i++) {
			temp = arr.get(i + 1);
			while (arr.get(i + 1) != 0) {
				swap = arr.get(i + 1);
				
				arr.set((i + 1),lcd % arr.get(i + 1));
				lcd = swap;
			}
			scm = scm/lcd*temp;
		}
		return scm;
	}
	public static int findLargestCommonDivisorOfTwoNum(Integer a, Integer b) {		
		
		int lcd = a;	
		int swap = 0;
			while (b != 0) {
				swap = b;
				b = lcd%b;
				lcd = swap;
			}
		return lcd;
	}


	public static int findLargestCommonDivisorOfIntArray(int[] arr) {		
		int len = arr.length;
		int lcd =arr[0];
		//int swap = 0;
		for (int i = 0; i < (len - 1); i++) {	
			lcd = findLargestCommonDivisorOfTwoNum(arr[i], arr[i+1]);
			 
			/*while (arr[i + 1] != 0) {
				swap = arr[i + 1];
				arr[i + 1] = lcd % arr[i + 1];
				lcd = swap;
			}*/
		}
		return lcd;
	}
	public static int findSmallestCommonMultipleOfIntArray(int[] arr) {		
		int len = arr.length;
		int lcd = arr[0];
	//	int swap = 0;
		int scm = arr[0];
		int temp = 0;
		for (int i = 0; i < (len - 1); i++) {
			temp = arr[i + 1];
			lcd = findLargestCommonDivisorOfTwoNum(arr[i], arr[i+1]);
			/*while (arr[i + 1] != 0) {
				swap = arr[i + 1];
				arr[i + 1] = lcd % arr[i + 1];
				lcd = swap;
			}*/
			scm = scm/lcd*temp;
		}
		return scm;
	}
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(100);
		a.add(99);
		a.add(98);
		a.add(97);
		a.add(96);
		a.add(95);
		a.add(94);
		a.add(93);
		a.add(92);
		a.add(91);
	
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(9);
		b.add(10);
		//System.out.println(getTotalX(a, b));
		int[] arr2 = new int[] { 100, 99, 98 ,97, 96, 95, 94, 93,92, 91};
		int[] arr3 = new int[] { 1, 2 ,3 ,4, 5 ,6 ,7, 8, 9, 10};
		System.out.println(getTotalX1(arr2, arr3));
	//	System.out.println(findLargestCommonDivisorOfIntArray(weight));
	//	int[] arr1 = {2,4};
	//	System.out.println(findSmallestCommonMultipleOfIntArray(arr1));
	//	System.out.println(findLargestCommonDivisorOfTwoNum(4,16));
	//	System.out.println(findLargestCommonDivisorOfList(b));
	//	System.out.println(findSmallestCommonMultipleOfList(a));
	}

}
