package hankerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {
	  /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    	int result = 0;
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < a.size(); i++) {
    		map.put(a.get(i), map.getOrDefault(a.get(i),0)+1);			
		}
    	for (int i = 0; i < a.size(); i++) {
    		int sum = map.getOrDefault(a.get(i), 0)+map.getOrDefault(a.get(i)+1, 0);
    		if(sum>result) {
    			result=sum;
    		}
    	}   	
    	return result;
    }
}
