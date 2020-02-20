package arrays;
public class RemoveDuplicates {
	
	public static int[] removeDuplicateElements(int[] intArray) {

		int[] newArray = new int[intArray.length];
		
		java.util.Arrays.sort(intArray);
		
		int k = 0 ;
		
		for( int i = 0; i < intArray.length-1; i++) { 
			           
          if(intArray[i] != intArray[i+1])
            newArray[k++] = intArray[i]; 
        } 
		newArray[k] = intArray[intArray.length-1];//must keep last one
		
		//to remove 0,0,0,0
		int[] result = new int[k + 1];
		for (int h = 0; h <= k; h++) {
			result[h] = newArray[h];
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		int[] intArray2 = new int[] {12,12,3,4,4,3,5,23,5,34,2,4};
		
		int[] newArray = removeDuplicateElements(intArray2);
		
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+ " ");
		}
		
	}
}
