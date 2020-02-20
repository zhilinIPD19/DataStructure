package arrays;
public class RemoveDuplicates {
	
	public int[] removeDuplicateElements(int[] intArray) {

		int[] newArray = new int[intArray.length];
		
		java.util.Arrays.sort(intArray);
		int i = 0;
		int k = 0 ;
		for( ; i < intArray.length-1; i++) { 
			           
          if(intArray[i] != intArray[i+1])
            newArray[k++] = intArray[i]; 
        } 
		newArray[k] = intArray[i];
		return newArray;
	}

	
}
