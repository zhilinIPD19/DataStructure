package arrays;
/*
 * Task
• Given an array of int length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
• With temp array
• Without temp array
 */
public class ReverseArray {
	
	public int[] reverseArray(int[] intArray) {
		
		int[] tempArray = new int[intArray.length];
		
		for (int i =intArray.length -1 ,k=0; i >= 0; i--) {
			tempArray[k++]=intArray[i];
		}		
		return tempArray;
	}

	public int[] reverseArrayWithourTempArray(int[] intArray) {
	
		for (int i = 0 ; i < intArray.length/2; i++) {
			
			int swap = intArray[i];
			intArray[i] = intArray [intArray.length-1-i];
			intArray [intArray.length-1-i] = swap;
			
		}
		return intArray;
	}
}
