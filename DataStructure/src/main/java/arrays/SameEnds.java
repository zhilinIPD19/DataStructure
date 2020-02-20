package arrays;

public class SameEnds {

	
	public static void main(String[] args) {
		int[] arr = {5,6,45,99,13,5,6};
		System.out.println(sameEnds(arr,1));
		System.out.println(sameEnds(arr,2));
		System.out.println(sameEnds(arr,3));
	}

	private static boolean sameEnds(int[] arr, int len) {
		// TODO Auto-generated method stub
		
		if(len >arr.length)
			
			return false;
		
		for (int j = 0 ; j < len ; j++) {
			
			if(arr[j] != arr[arr.length + len - j]) {
				return false;
			}
		}
		
		return true;
	}
}
