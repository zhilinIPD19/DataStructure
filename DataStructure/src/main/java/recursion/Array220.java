package recursion;

public class Array220 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,20};
		int[] arr2 = {3,30};
		int[] arr3 = {3};
		System.out.println(array220(arr1,0));
		System.out.println(array220(arr2,0));
		System.out.println(array220(arr3,0));
	}

	private static boolean array220(int[] arr, int index) {
		if(index >= arr.length-1)
			return false;
		if(arr[index]*10 == arr[index+1])
			return true;
		else
			return array220(arr, index+1);
		//return arr[index]*10 == arr[index+1]||array220(arr, index+1);
	}
}
