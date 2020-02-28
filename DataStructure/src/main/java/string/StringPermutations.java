package string;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * * Java program to find all permutations of a given String using recursion. *
 * For example, given a String "XYZ", this program will print all 6 possible
 * permutations of * input e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX * * @author Javin
 * Paul
 */
public class StringPermutations {
	private static SortedSet<String> set = new TreeSet<String>();
	public static void main(String args[]) {
		permutation("1234");
		System.out.println(set);
	}

	/* * A method exposed to client to calculate permutation of String in Java. */ 
	public static void permutation(String input) {
		permutation("", input);
		//permutationOneDirection("", input);
	}

	/*
	 * * Recursive method which actually prints all permutations * of given String,
	 * but since we are passing an empty String * as current permutation to start
	 * with, * I have made this method private and didn't exposed it to client.
	 */
	
	private static void permutation(String perm, String word) 
	{
		if (word.isEmpty()) { 
			String setString = perm + word;
			set.add(setString);
			} 
	else { 
		for (int i = 0; i < word.length(); i++) 
		{
			permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i+1)); 
			}
		} 
	}
/*	
	private static void permutationOneDirection(String perm, String word) {
		if (word.isEmpty()) {
		System.err.println(perm + word);

		} else {
		for (int noMore = 0; noMore <= 1; noMore++) {
		if (noMore == 0) {
		for (int i = 0; i < word.length(); i++) {
		permutation(perm + word.charAt(i), word.substring(i + 1, word.length()));
		}
		} else {
		permutation(perm, "");
		}
		}
		
		}
	}*/
}

		
