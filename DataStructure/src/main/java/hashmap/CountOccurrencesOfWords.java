package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfWords {
	
	public static void countOccurrencesOfWords(String str) {
		
		String[] words = str.split(" ");
		
		Map<String,Integer> occurances = new HashMap<String,Integer>();
		
		for (String word : words){	
			
			if(!occurances.containsKey(word)) {
				
				occurances.put(word,1);}
			
			else occurances.put(word,(occurances.get(word)+1));
		}
		
		
		occurances.forEach((keeeey,vaaaalue) -> System.out.println("Key = "

                + keeeey + ", Value = " + vaaaalue)); 
		

	}
	static int sockMerchant(int n, int[] ar) {
		
		Map<Integer,Integer> occurances = new HashMap<Integer,Integer>();
		int pairs = 0;
		for (int num : ar){	
			
			if(!occurances.containsKey(num)) {
				
				occurances.put(num,1);}
			
			else occurances.put(num,(occurances.get(num)+1));
		}
		Object[] arr = occurances.values().toArray();
			for (int i = 0; i < arr.length; i++) {
				pairs +=(int)arr[i]/2;
			}
				
		return pairs;
		}
	static int hourglassSum(int[][] arr) {
        int[] sums = new int[(arr.length-2)*(arr.length-2)];
        int j = 0;
        for(int i = 0; i < arr.length-2;i++){
            for(int k = 0; k < arr.length-2;k++){
                sums[j++] = arr[i][k]+arr[i][k+1]+arr[i][k+2]+arr[i+1][k+1]+arr[i+2][k]+arr[i+2][k+1]+arr[i+2][k+2];
            }
        }
        int maxSum = sums[0];
        for (int i = 1; i < sums.length; i++) {
            if(maxSum < sums[i]) {
                maxSum = sums[i];
            }
        }
        return maxSum;
    }

	
	
	public static void main(String[] args) {
		String str = "abs abc abc abd abs";
		countOccurrencesOfWords(str);
	
}
}
