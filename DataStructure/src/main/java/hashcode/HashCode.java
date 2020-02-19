package hashcode;

import java.util.HashSet;
import java.util.Set;

public class HashCode {
	public static void findUniqueNumbers(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);							
			}	
		set.stream().forEach(n->System.out.println(n));
		}
		
	
	public static boolean containAllVowels(String str) {
		
		Set<Character> setOfVowels = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				setOfVowels.add(str.charAt(i));
			}
		}
		
		return setOfVowels.size() == 5;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,6,7};
		
		findUniqueNumbers(arr);
		
		
		String str = "aeiouhsdjvfcdkj";
		
		System.out.println(containAllVowels(str));
	
	}
}
