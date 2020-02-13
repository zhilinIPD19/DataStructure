package com.johnabbott;

public class Main {
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
