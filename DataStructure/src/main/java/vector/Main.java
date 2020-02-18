package vector;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {	

	Vector<Integer> vectorInts = new Stack<Integer>();
	
	vectorInts.add(1);
	vectorInts.add(2);
	vectorInts.add(3);
	
	Collections.reverse(vectorInts);
	
	System.out.println(vectorInts.toString());
	
	
}
}