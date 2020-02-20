package recursion;

public class PrintFun {
	public void printFun(int test) {
		if(test<1) {
			return;
		}
		else{
			System.out.printf("%d ",test);
			printFun(test-1);
			System.out.printf("%d ",test);
			//return;
		}
		
	}
	public int fact(int n) {	
		
		if(n == 1) {
			return 1;
		}		
		return fact(n-1)*n;	
	}
	
	public int power(int base, int n) {	
		if(n == 0) {
			return 1;
		}
			
		return power(base, n -1 ) * base;	
	}
	public int FindMaxium(int[] intArray,int length) {	
		
		
		
		if(length == 1) {
			return intArray[0];
		}				
		
		return Math.max(intArray[length -1], FindMaxium(intArray, length -1));	
				 
	}
	
	public int count(String str,String str1) {	
		
		if(str.length() <2) {
			return 0;
		}
		if(str.substring(0, 2).equals(str1))
		{
			return 1+ count(str.substring(2),str1);
		}
		return count(str.substring(1),str1);
		
	}
	public String replace(String str, char x,char y) {	
		if(str.length() <= 0)
			return "";
		if(str.charAt(0) == x) {
			return y + replace(str.substring(1), x , y);
		}
				
		return str.charAt(0) + replace(str.substring(1), x , y);
	
		
	}
	public String remove(String str, char x) {
		
		if(str.length() <= 0)
			return "";
		if(str.charAt(0) == x) {
			return remove(str.substring(1), x );
		}
				
		return str.charAt(0) + remove(str.substring(1), x );
			
		
	}
	
		public static void main(String[] args) {
		PrintFun printFun = new PrintFun();
		//printFun.printFun(5);
		System.out.println(printFun.fact(7));
		System.out.println(printFun.power(7,3));
		
		int[] intArray = {1,2,3,4};
		java.util.Arrays.sort(intArray);
		System.out.println(printFun.FindMaxium(intArray, 4));
		
		String str1 = "chiwachiwa";
		System.out.println(printFun.count(str1,"hi"));
		String str2 = "xyxyxy";
		System.out.println(printFun.replace(str2,'x','y'));
		System.out.println(printFun.remove(str2,'x'));
	}
}
	
	


