package hankerrank;

import java.util.HashMap;
import java.util.Map;

public class CommonChild {
	 static int commonChild(String s1, String s2) {

		 int count = 0;
	    	Map<Character,Integer> mapA = new HashMap<Character,Integer>();
	    	Map<Character,Integer> mapB = new HashMap<Character,Integer>();
	    	for (int i = 0; i < s1.length(); i++) {
	    		mapA.put(s1.charAt(i), mapA.getOrDefault(s1.charAt(i), 0)+1);			
			}
	    	for (int i = 0; i < s2.length(); i++) {
	    		mapB.put(s2.charAt(i), mapB.getOrDefault(s2.charAt(i), 0)+1);	
	    	}
	    	for (Character key : mapA.keySet()) {
				if(mapB.containsKey(key)) {
					count += Math.min(mapB.get(key),mapA.get(key));
				}
	    	}
	    	return count;
	    
	    }
}
