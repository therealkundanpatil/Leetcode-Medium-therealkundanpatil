package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Medium
 * 
 * Id: 1381		Design stack with increment operation
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class CustomStack {
	List<Integer> list = null;
	int maxSize;

	public CustomStack(int maxSize) {
		this.list = new ArrayList<>();
		this.maxSize = maxSize;
	}

	public void push(int x) {
		if (list.size() < maxSize) {
			list.add(x);
		}
	}

	public int pop() {
		if (list.isEmpty()) {
			return -1;
		}
		return list.remove(list.size() - 1);
	}

	public void increment(int k, int val) {
		for (int i = 0; i < k && i < list.size(); ++i) {
			list.set(i, list.get(i) + val);
		}
	}
}
