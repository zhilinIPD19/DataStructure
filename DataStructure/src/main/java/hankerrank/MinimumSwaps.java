package hankerrank;

public class MinimumSwaps {

	// not very efficient when time limits
	static int minimumSwaps1(int[] arr) {
		int count = 0;

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
				count++;

			}
		}
		return count;
	}

	static int minimumSwaps(int[] arr) {

		int count = 0;
		boolean visited[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int cycle = 0;

			while (!visited[i]) {
				visited[i] = true;
				i = arr[i] - 1;
				cycle++;
			}

			if (cycle != 0)
				count += cycle - 1;
		}

		return count;
	}
	public static void main(String[] args) {
		int[] intArray = { 4, 3, 1, 2 };
		System.out.println(minimumSwaps(intArray));
	}

}
