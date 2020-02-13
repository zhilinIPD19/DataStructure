
public class Searchs {
		public int binaryResearch(int[] intArray, int num) {
			int index = 0;
			
			int midIndex = (intArray.length +1) /2;
			
			while(midIndex >= 0) {
				
				if(num <= intArray[midIndex]) {
					midIndex = (midIndex+1)/2;					
				}
				if(num >= intArray[midIndex]) {
					midIndex = (intArray.length - midIndex)/2;					
				}
				if(num == intArray[midIndex]) {
					index = midIndex;	
					break;
				}
			}											
			return index;
		}
}
