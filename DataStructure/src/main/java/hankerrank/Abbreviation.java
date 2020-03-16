package hankerrank;

public class Abbreviation {
	public static String abbreviation(String a, String b) {
		int[] result = countCommonLetters(a, b);
		return result[1]!=1&&result[0]==b.length()?"YES":"NO";
			
	}
		
	public static int[] countCommonLetters(String a, String b) {
		int[] result = new int[2];
		
		if(b.length()<=0&&a.length()>0) {
			if(Character.isUpperCase(a.charAt(0))) { 
				result[1] = 1;
				}
			countCommonLetters(a.substring(1), b);
			
		}else if(a.length()<=0) {
			result[0] = 0;
			}
		else if(Character.toLowerCase(a.charAt(0))==Character.toLowerCase(b.charAt(0))) {
			result[0] = countCommonLetters(a.substring(1), b.substring(1))[0]++;
			
		}
		else {
			if(Character.isUpperCase(a.charAt(0))) 
				result[1] = 1;
			
			result[0] = countCommonLetters(a.substring(1), b)[0];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String a = "UMKFW";
		String b = "UMKFW";
		System.out.println(countCommonLetters(a,b)[0]);
	}
	
	

}
