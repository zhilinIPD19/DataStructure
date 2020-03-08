package hankerrank;

public class ArrayManipulation {
	   static long arrayManipulation(int n, int[][] queries) {
		    //Array storing how much one element is bigger than the previous element after each manipulation.
		   	long resultArray[] = new long[n + 2];
			for (int i = 0; i < queries.length; i++) {
				int a = queries[i][0];
				int b = queries[i][1];
				int k = queries[i][2];
				resultArray[a] += k;
				resultArray[b+1] -= k;
			}
			//get the max value
			long max = Long.MIN_VALUE;
			long sum = 0;
			for (int i = 0; i < resultArray.length; i++) {
				sum += resultArray[i];
				max = Math.max(max, sum);
			}
			
			return max;
	    }

}
