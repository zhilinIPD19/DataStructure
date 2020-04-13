package leetCode;

//Given an integer array nums, find the contiguous subarray (containing at least one number) 
//which has the largest sum and return its sum.
//https://en.wikipedia.org/wiki/Maximum_subarray_problem
public class MaxSubArray {
	
	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum = Math.max(nums[i], sum+nums[i]);
			maxSum = Math.max(sum, maxSum);
		}
		
		return maxSum;       
    }
}
