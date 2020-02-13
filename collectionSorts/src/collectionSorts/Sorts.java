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
					int swap = arr[i];
					smallest= arr[j];
					arr[i] = smallest;
					arr[j] = swap;					
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void insertionSorts(int[] arr) {
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {	
					int swap = arr[i];			
					arr[i] = arr[j];
					arr[i+1] = swap;
					for(int k = i + 1; k < j; k++) {
								
						arr[k] = arr[k+1];
						arr[i+1] = swap;
					arr[k] = arr[k+1];	}				
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
