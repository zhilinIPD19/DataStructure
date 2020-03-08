package hankerrank;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagram {
    static int makeAnagram(String a, String b) {
    	int count = 0;
    	Map<Character,Integer> mapA = new HashMap<Character,Integer>();
    	Map<Character,Integer> mapB = new HashMap<Character,Integer>();
    	for (int i = 0; i < a.length(); i++) {
    		mapA.put(a.charAt(i), mapA.getOrDefault(a.charAt(i), 0)+1);			
		}
    	for (int i = 0; i < b.length(); i++) {
    		mapB.put(b.charAt(i), mapB.getOrDefault(b.charAt(i), 0)+1);	
    	}
    	for (Character key : mapA.keySet()) {
			if(mapB.containsKey(key)) {
				count += Math.abs(mapB.get(key)-mapA.get(key));
			}else {
				count += mapA.get(key);
			}
		}
    	for (Character key : mapB.keySet()) {
			if(!mapA.containsKey(key)) {
				count += mapB.get(key);
			}
		}
    	return count;
    }

}
