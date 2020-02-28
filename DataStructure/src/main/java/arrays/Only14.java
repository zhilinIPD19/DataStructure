package arrays;

import java.util.ArrayList;
import java.util.List;

public class Only14 {

	public static boolean only14(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}

		return true;

	}

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<Integer>();
		int pointA = 0;
		int pointB = 0;
		for (int i = 0; i < 3; i++) {
			if ((a.get(i)).intValue() > (b.get(i)).intValue()) {
				pointA++;
			} else if ((a.get(i)).intValue() < (b.get(i)).intValue()) {
				pointB++;
			}
		}
		System.out.println(pointA + " " + pointB);
		return result;
	}

	static long aVeryBigSum(long[] ar) {

		long aVeryBigSum = 0;
		for (int i = 0; i < ar.length; i++) {
			aVeryBigSum += ar[i];
		}
		return aVeryBigSum;
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int result = 0;
		int sumRight = 0;
		int sumLeft = 0;
		int size = arr.size();
		for (int i = 0; i < size; i++) {
			sumRight += arr.get(i).get(i);
			sumLeft += arr.get(i).get(size - i - 1);
		}
		result = Math.abs(sumRight - sumLeft);
		return result;
		// Write your code here

	}

	static void plusMinus(int[] arr) {
		int countPlus = 0;
		int countMinus = 0;
		int countZero = 0;
		int countInts = arr.length;
		for (int i = 0; i < countInts; i++) {
			if (arr[i] > 0) {
				countPlus++;
			} else if (arr[i] < 0) {
				countMinus++;
			} else
				countZero++;
		}
		System.out.printf("%.7f%n%.7f%n%.7f", (float) (countPlus / countInts), (float) (countMinus / countInts),
				(float) (countZero / countInts));
	}

	static int birthdayCakeCandles(int[] ar) {
		int age = ar.length;
		int count = 0;
		int highest = ar[0];
		for (int i = 1; i < age; i++) {
			if (ar[i] > highest) {
				highest = ar[i];
			}
		}
		for (int i = 0; i < age; i++) {
			if (ar[i] == highest) {
				count++;
			}

		}
		return count;
	}

	static String timeConversion(String s) {
		if (s.charAt(8) == 'P') {
			return s.substring(0, 2).equals("12") ? "12" + s.substring(2, 8)
					: Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, 8);
		} else
			return s.substring(0, 2).equals("12") ? "00" + s.substring(2, 8) : s.substring(0, 8);
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		for (int i = 0; i < grades.size(); i++) {
			int grade = grades.get(i);
			grades.set(i, grade % 5 >= 3 && grade >= 38 ? (grade / 5 + 1) * 5 : grade);
		}
		return grades;
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int countA = 0;
		int countO = 0;
		for (int i = 0; i < apples.length; i++) {
			if ((apples[i] + a) >= s)
				countA++;
		}
		for (int i = 0; i < oranges.length; i++) {
			if ((oranges[i] + b) <= t)
				countO++;
		}
		System.out.println(countA);
		System.out.println(countO);
	}

	static String kangaroo(int x1, int v1, int x2, int v2) {

		return (x2 - x1) % (v1 - v2) == 0 && ((x2 - x1) / (v1 - v2)) * v2 + x2 <= 10000 && v1 > v2 ? "YES" : "NO";
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 1, 4 };
		int[] arr2 = { 1, 4, 2, 4 };
		System.out.println(only14(arr1));
		System.out.println(only14(arr2));
		List<Integer> arr3 = new ArrayList<Integer>();
		List<Integer> arr4 = new ArrayList<Integer>();
		arr3.add(1);
		arr3.add(2);
		arr3.add(3);
		arr4.add(4);
		arr4.add(5);
		arr4.add(6);
		System.out.println(compareTriplets(arr3, arr4));
		long[] arr5 = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };

		System.out.println(aVeryBigSum(arr5));

		List<List<Integer>> arr6 = new ArrayList<List<Integer>>();
		List<Integer> arr7 = new ArrayList<Integer>();
		arr7.add(9);
		arr7.add(8);
		arr7.add(9);
		arr6.add(arr3);
		arr6.add(arr4);
		arr6.add(arr7);
		System.out.println(diagonalDifference(arr6));

		plusMinus(arr1);
		System.out.println();
		System.out.println(birthdayCakeCandles(arr1));
		System.out.println(timeConversion("12:10:00AM"));

		List<Integer> arr8 = new ArrayList<Integer>();
		arr8.add(49);
		arr8.add(57);
		arr8.add(29);
		System.out.println(gradingStudents(arr8));

		int[] arr9 = { 2, 3, -4 };
		int[] arr10 = { 3, -2, -4 };
		countApplesAndOranges(7, 10, 4, 12, arr9, arr10);
		System.out.println(kangaroo(4523,8092,9419,8076));
	}
}