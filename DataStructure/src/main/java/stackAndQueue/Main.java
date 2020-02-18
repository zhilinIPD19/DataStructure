package stackAndQueue;

import java.util.ArrayList;

public class Main {
	public static <T> void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(new Integer(1));
		ints.add(new Integer(2));
		ints.add(new Integer(3));
		ints.add(new Integer(4));
		Stack<Integer> stack = new Stack<Integer>(ints);
		System.out.println(stack.pop());
		
		
		
	}
}
