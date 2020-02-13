package collectionSorts;

public class Sorts {
	public void bubbleSorts(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int swap = arr[i];
					arr[i]= arr[j];
					arr[j]= swap;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void selectionSorts(int[] arr) {
		
		
		for(int i = 0; i < arr.length; i++) {
			int smallest = arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {	
					smallest= arr[j];								
				}
				int swap = arr[i];
				arr[i] = arr[j] ;
				arr[j] = swap;	
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void insertionSorts(int[] arr) {
		
		int length = arr.length;
		for(int i = 1; i < length; i++) {
			int key = arr[i];
			for(int j= i -1; j >0; j--) {
				arr[j+1] = arr[j];
			}
					arr[j+1] = key;				
				}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
