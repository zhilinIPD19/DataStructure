package hankerrank;

public class DivisibleSumPairs {
	 /**
	  * You are given an array of integers, and a positive integer, . Find and print the number of pairs where and  +  is divisible by k .
	  * @param n: the length of array
	  * @param k: divisible by k 
	  * @param ar: an array of integers
	  * @return: pairs of integers
	  */
    static int divisibleSumPairs(int n, int k, int[] ar) {
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if((ar[i]+ar[j])%k==0)
					count++;
			}			
		}
				
		return count;
    }
    public static void main(String[] args) {
    	int n = 6;
    	int k = 3;
		int[] ar = {1, 3 ,2 ,6, 1, 2};
		System.out.println(divisibleSumPairs(n,k,ar));
	}

}
