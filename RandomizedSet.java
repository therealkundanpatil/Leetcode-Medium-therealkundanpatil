package medium;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * LeetCode Medium
 * 
 * Id: 380		 Insert Delete getRandom() in O(1)
 * 
 * Time Complexity : O(1)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class RandomizedSet {
	Set<Integer> set = null;

	/** Initialize your data structure here. */
	public RandomizedSet() {
		this.set = new HashSet<Integer>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		if (!set.contains(val)) {
			set.add(val);
			return true;
		}
		return false;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		if (set.contains(val)) {
			set.remove(val);
			return true;
		}
		return false;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random random = new Random();
		Integer[] hashSetData = set.toArray(new Integer[0]);
		return hashSetData[random.nextInt(set.size())];
	}
}
