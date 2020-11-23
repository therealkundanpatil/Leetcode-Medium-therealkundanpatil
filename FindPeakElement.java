package medium;

/**
 * LeetCode Medium
 * 
 * Id : 162		Find Peak Element
 * 
 * Time complexity : O(n)
 * 
 * Space complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
    	for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
}
