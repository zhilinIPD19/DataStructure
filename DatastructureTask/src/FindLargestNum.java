

public class FindLargestNum {
	
	public int findLargest(int[] intArray) {
		
		if (intArray.length == 0) {
			return -1;//we can change this to index to avoid result same as -1
		}		
		int largestNum = intArray[0];
		for(int i = 1;i<intArray.length; i ++) {
			if (largestNum < intArray [i]) {
				largestNum = intArray[i];
			}			
		}		
		return largestNum;
	}

}
