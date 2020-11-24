package medium;

/**
 * LeetCode Medium
 * 
 * Id : 55	Jump Game
 * 
 * Time complexity : O(n)
 * 
 * Space complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class JumpGame {
	public boolean canJump(int[] nums) {
		int[] dp = new int[nums.length];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], (i - 1) + nums[i - 1]);

			if (dp[i] < i) {
				return false;
			}
		}

		return true;
	}
}
