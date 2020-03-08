package hankerrank;

public class HourglassSum {
	static int hourglassSum(int[][] arr) {
		int[] sums = new int[(arr.length - 2) * (arr.length - 2)];
		int j = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int k = 0; k < arr.length - 2; k++) {
				sums[j++] = arr[i][k] + arr[i][k + 1] + arr[i][k + 2] + arr[i + 1][k + 1] + arr[i + 2][k]
						+ arr[i + 2][k + 1] + arr[i + 2][k + 2];
			}
		}
		int maxSum = sums[0];
		for (int i = 1; i < sums.length; i++) {
			if (maxSum < sums[i]) {
				maxSum = sums[i];
			}
		}
		return maxSum;
	}

}
