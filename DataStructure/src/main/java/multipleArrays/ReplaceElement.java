package multipleArrays;
/*
 * • Write a program to replace “purple” with yellow in
• String[][] arr = {{"red","orange", "purple"}, {"green","blue", "indigo"}};
 */
public class ReplaceElement {
	
	public String[][] replaceElement(String[][] arr, String str1,String str2){
	
		int rows = arr.length;
		
		for(int i = 0; i < rows; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				if(arr[i][k].equals(str1)) {//it is better to use equals
					arr[i][k] = str2;
				}
			}
		}
		return arr;
	}
}
