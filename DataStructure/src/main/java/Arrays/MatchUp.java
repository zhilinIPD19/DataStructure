package Arrays;

public class MatchUp {
	public static int matchUp(int[] arr1, int[] arr2) {
		int count = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr1[i] - arr2[i] <=2 && arr1[i] - arr2[i] >=-2 &&arr1[i] != arr2[i] ) {
				//Math.obs
				count++;
			}
			
		}		
		return count;
		
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,10};
		int[] arr3 = {2,3,5};
		int[] arr4 = {2,3,3};
		
		System.out.println(matchUp(arr1, arr2));
		System.out.println(matchUp(arr1, arr3));
		System.out.println(matchUp(arr1, arr4));
	}
}
