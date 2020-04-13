package hankerrank;

public class MaxSubSetSum {
	/*
	 *Given an array of integers, find the subset of 
	 *non-adjacent elements with the maximum sum. Calculate the sum of that subset. 
	 * 
	 * */
	static int maxSubsetSum(int[] arr) {
				
		int currentPosition = 1;// check start from index 1
		int incl = arr[0];// sum include current position 
		int excl = 0;//Initialize first sum to check if max sum can include first element
		int exclNext = 0;//sum exclude current position for checking next item
		while(currentPosition < arr.length) {
			//current max excluding current position
			exclNext = Math.max(incl,excl);
			//current max including current position
			incl = excl + arr[currentPosition];
			excl = exclNext;
			currentPosition++;
		}
		return Math.max(incl,excl);    
	}
}