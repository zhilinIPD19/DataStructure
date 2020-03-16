package hankerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/***
 * Complete the migratoryBirds function in the editor below. It should return the lowest type number of the most frequently sighted bird.
 * 
 *param : arr: an array of integers representing types of birds sighted
 * @author zhilin
 *
 */
public class MigratoryBirds {
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.size(); i++) {
			map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);			
		}
		int keyBird = 1;
		for (int key = 1; key <= 5; key++) {
			if(map.getOrDefault(key, 0) > map.getOrDefault(keyBird, 0)){
				keyBird = key;				
			}
		}
		return keyBird;
    }
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		System.out.println(migratoryBirds(list));
	}

}
