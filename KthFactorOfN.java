package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode : Medium
 * 
 * ID : 1492		The kth factor of N
 * 
 * Time complexity : O(n)
 * 
 * Space complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class KthFactorOfN {
	public int kthFactor(int n, int k) {
		// Call a function that would return all possible factors of n
		List<Integer> factorList = fetchAllFactors(n);
		
		// If k happens to be greater than factor list size return -1, else return factor(1 based indexing) 
		if (k > factorList.size()) {
			return -1;
		} else {
			return factorList.get(k - 1);
		}
	}

	/**
	 * Compute all the factors of a given number and store them in an ArrayList
	 * @param number
	 * @return
	 */
	public static List<Integer> fetchAllFactors(int number) {
		List<Integer> myListToReturn = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				myListToReturn.add(i);
			}
		}

		return myListToReturn;
	}
}
