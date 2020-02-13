
public class MainClass {
	public static void main(String[] args) {
		
	 FindLargestNum findLargest = new FindLargestNum();
	 
	 FindSmallestNum findSmallestNum =  new FindSmallestNum();
	 
	int[] intArray = new int[] {12,23,5,34,2,4};
	
	int largestNum = findLargest.findLargest(intArray);
	int smallestNum = findSmallestNum.findSmallest(intArray);
	
	System.out.println("This array's largest number is " + largestNum);
	System.out.println("This array's smallest number is " + smallestNum);
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	RemoveDuplicates removeDuplicates = new RemoveDuplicates();
	int[] intArray2 = new int[] {12,12,3,4,4,3,5,23,5,34,2,4};
	
	int[] newArray = removeDuplicates.removeDuplicateElements(intArray2);
	
	
	System.out.println(newArray.length);
	
	/////////////////////////////////////////////////////////////////////////////////
	ReverseArray reverseArray = new ReverseArray();
	int[] intArray3 = new int[] {1,2,3};
	for(int i = 0; i < intArray3.length;i++) {
		System.out.print((reverseArray.reverseArray(intArray3))[i] + " ");
	}
	System.out.println();
	for(int i = 0; i < intArray3.length;i++) {
		System.out.print((reverseArray.reverseArrayWithourTempArray(intArray3))[i] + " ");
	}
	System.out.println();
	
	///////////////////////////////////////////////////////////////
	ChangeValue changeValue =  new ChangeValue();
	int[] intArray4 = new int[] {1,2,3,8,7};
	for(int i = 0; i < intArray4.length;i++) {
		System.out.print(((changeValue.changeValue(intArray4)))[i] + " ");
	}
	System.out.println();
	/////////////////////////////////////////////////////////////////////
	Employee[] employees = new Employee[5];
	employees[0] = new Employee("toto1",1230);
	employees[1] = new Employee("toto2",2230);
	employees[2] = new Employee("toto3",3230);
	employees[3] = new Employee("toto4",4230);
	employees[4] = new Employee("toto5",5230);
	
	System.out.println("Employees are: ");
	for(int i = 0; i < employees.length;i++) {
		System.out.println(employees[i]);
	}
	System.out.println();
	
 }
}
	

