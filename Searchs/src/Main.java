

public class Main {
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
