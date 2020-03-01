package arrays;

public class MoveArray {
	 static int[] rotLeft(int[] a, int d) {
	        int[] newAr = new int[a.length]; 
	        for(int i = 0; i < a.length-d; i++){
	            newAr[i] = a[i+d];
	        }
	        for(int k = a.length-d; k < a.length; k++){
	            newAr[k] = a[k-a.length+d];
	        }
	        return newAr;
	    }
	 static void minimumBribes(int[] q) {
         int count = 0;
         int len = q.length;
         for(int i = len-2; i >= 0; i-- ) {
             int num = q[i];
             int countBribes = 0;
             while(i < len -1 && q[i+1]<num ) {
                 q[i] = q[i+1]; 
                 i++; 
                 countBribes++;
                 if( countBribes > 2 ) {
                     System.out.println("Too chaotic");
                     return;
                 }
             }
             q[i] = num ; 
            count += countBribes;
         }
         System.out.println(count);        
 }
	    public static int bribeFunction( int q[], int n ) {
	        int i = 0, numBribes = 0;
	        for( i = n-2; i >= 0; i-- ) {
	            int j = i+1, t = q[i];
	            int countB = 0;
	            while( (j < n) && (t > q[j]) ) {
	                q[j-1] = q[j]; j++; countB++;
	                if( countB > 2 ) {
	                	return -1;
	                }
	            }
	            q[j-1] = t; numBribes += countB;
	        }
	        return numBribes;
	    }
	    
	    public static void main(String[] args) {
	    	int[] arr = {1,2,5,3,7,8,6,4};
	    	minimumBribes(arr);
		}

}
