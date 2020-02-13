
public class FindSmallestNum {

	public int findSmallest(int[] intArray) {
		
		if (intArray.length == 0) {
			return -1;
		}
		int smallestNum = intArray[0];
		for(int i = 1;i<intArray.length; i ++) {
			if (smallestNum >= intArray [i]) {
				smallestNum = intArray[i];
			}			
		}		
		return smallestNum;
	}
}
