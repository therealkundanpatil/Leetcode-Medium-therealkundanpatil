package medium;

public class MaximumProductSubArray {
	public static int maxProduct(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		int currentMaximum = nums[0];
		int currentMinimum = nums[0];
		int globalMaximum = currentMaximum;

		for (int i = 1; i < nums.length; i++) {

			int currentMaximumCopy = currentMaximum;

			currentMaximum = Math.max(nums[i], Math.max(nums[i] * currentMaximum, nums[i] * currentMinimum));
			currentMinimum = Math.min(nums[i], Math.min(nums[i] * currentMaximumCopy, nums[i] * currentMinimum));

			globalMaximum = Math.max(currentMaximum, Math.max(currentMinimum, globalMaximum));
		}

		return globalMaximum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 0, 4, 5, 2 };
		System.out.println(maxProduct(nums));
	}
}
