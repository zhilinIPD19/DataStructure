
public class ChangeValue {
	public int[] changeValue(int[] intArray){
		
		int[] tempArray = new int[intArray.length];
		
		int largest = intArray[0];
		for(int i = 1; i< intArray.length; i++) {
			if(intArray[i] >= largest) {
				largest = intArray[i];
			}				
		}
		
		for(int i = 0; i< intArray.length; i++) {
		tempArray[i] = largest;
		}
		return tempArray;
		
	}
}
