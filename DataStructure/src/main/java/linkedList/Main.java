package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		
		Collections.reverse(ints);
		
		System.out.println(ints.toString());
	}
}
