package medium;

import java.util.Arrays;

/**
 * LeetCode Medium
 * 
 * Id : 215		Kth largest element in an array
 * Time complexity : O(n)
 * Space complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class KthLargestElementInArray {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);

		for (int i = nums.length - 1, j = 1; i >= 0; i--, j++) {
			if (j == k) {
				return nums[i];
			}
		}

		return -1;
	}
}
