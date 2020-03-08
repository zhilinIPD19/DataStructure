package hankerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqQuery {
	static List<Integer> freqQuery(List<List<Integer>> queries) {
		List<Integer> freqQuery = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < queries.size(); i++) {
			Integer num = queries.get(i).get(1);
			switch (queries.get(i).get(0)) {
			case 1:
				map.put(num, map.getOrDefault(num, 0) + 1);
				break;
			case 2:
				if (map.containsKey(num)) {
					map.put(num, map.get(num) - 1);
				}
				break;
			case 3:
				if (map.containsValue(queries.get(i).get(1))) {
					freqQuery.add(1);
					break;
				} else {
					freqQuery.add(0);
					break;
				}
			}
		}
		return freqQuery;
	}


}
