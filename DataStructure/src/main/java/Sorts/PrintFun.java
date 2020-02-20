package Sorts;

public class PrintFun {
	
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
				
				int indexSmallest = i;
				
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[j] < arr[i]) {	
						indexSmallest= j;								
					}
					int swap = arr[indexSmallest];
					arr[indexSmallest] = arr[i] ;
					arr[i] = swap;	
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
				int j= i -1;
				
				while(j >=0 &&arr[j]>key) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = key;				
					}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		public static void main(String[] args) {
			
			PrintFun sorts = new PrintFun();
			
			int[] intArray = {3,1,6,9,5};
			
			sorts.bubbleSorts(intArray);
			System.out.println();
			sorts.selectionSorts(intArray);
			System.out.println();
			sorts.insertionSorts(intArray);
		}
	}



