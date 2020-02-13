package collectionSorts;

public class Main {
	public static void main(String[] args) {
		
		Sorts sorts = new Sorts();
		
		int[] intArray = {3,1,6,9,5};
		
		//sorts.bubbleSorts(intArray);
		System.out.println();
		//sorts.selectionSorts(intArray);
		sorts.insertionSorts(intArray);
	}
}
