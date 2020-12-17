package medium;

import java.util.HashMap;
import java.util.Map;

public class DesignHitCounter {
	Map<Integer, Integer> map;
	/** Initialize your data structure here. */
//    public HitCounter() {
//        map = new HashMap<>();
//    }

	/**
	 * Record a hit.
	 * 
	 * @param timestamp - The current timestamp (in seconds granularity).
	 */
	public void hit(int timestamp) {
		if (!map.containsKey(timestamp)) {
			map.put(timestamp, 1);
		} else {
			int value = map.get(timestamp);
			map.put(timestamp, ++value);
		}

	}

	/**
	 * Return the number of hits in the past 5 minutes.
	 * 
	 * @param timestamp - The current timestamp (in seconds granularity).
	 */
	public int getHits(int timestamp) {
		int answer = 0;
		int limit = ((timestamp - 300) >= 1) ? timestamp - 300 : 0;
		for (int i = timestamp; i > limit; i--) {
			if (!map.containsKey(i)) {
				answer += 0;
			} else {
				answer += map.get(i);
			}
		}

		return answer;
	}
}
