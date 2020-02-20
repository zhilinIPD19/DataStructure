package searchs;

public class Searchs {
	public int binaryResearch(int[] intArray, int num) {
		
		int index = 0;
		
		int midIndex = (intArray.length +1) /2;
		
		while(midIndex >= 0) {
			
			if(num < intArray[midIndex]) {
				midIndex = midIndex/2;					
			}
			if(num > intArray[midIndex]) {
				midIndex = (intArray.length - midIndex)/2;					
			}
			if(num == intArray[midIndex]) {
				index = midIndex;	
				break;
			}
		}											
		return index;
	}
	
	public static void main(String[] args) {
		
		
		Searchs search = new Searchs();
		
		int[] intArray = {3,1,7,8,6,9,5};
		
		//sorts.bubbleSorts(intArray);
		java.util.Arrays.sort(intArray);
		System.out.println();
		int index = search.binaryResearch(intArray, 9);
		System.out.println(index);
		
	}
}

