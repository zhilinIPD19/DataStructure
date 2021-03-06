package Sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintFun {

	public void bubbleSorts(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void selectionSorts(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int currentIndexSmallest = i;
			int currentSmallest = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < currentSmallest) {
					currentIndexSmallest = j;
					currentSmallest = arr[j];
				}
			}
			if (currentIndexSmallest != i) {
				arr[currentIndexSmallest] = arr[i];
				arr[i] = currentSmallest;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public void insertionSorts(int[] arr) {

		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

	public static void main(String[] args) {

		// PrintFun sorts = new PrintFun();

		int[] intArray = { 4, 3, 1, 2 };

		// sorts.bubbleSorts(intArray);
		System.out.println();
		// sorts.selectionSorts(intArray);
		System.out.println();
		// sorts.insertionSorts(intArray);
		System.out.println();
		
	}
}
