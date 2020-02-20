package deQue;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		Deque<Character> dq = new LinkedList<Character>();
		Character[] chars = {'a','b','c','d','e'};
		
		for (int i = 0; i < chars.length; i++) {
			dq.addFirst(chars[i]);
			dq.addLast(chars[i]);
		}
			
		System.out.println(dq.toString());
		
		
		
	}
}
