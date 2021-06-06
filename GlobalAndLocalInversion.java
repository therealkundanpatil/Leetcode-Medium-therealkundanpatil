package medium;

public class GlobalAndLocalInversion {
	public static boolean isIdealPermutation(int[] nums) {
		int globalInversionCount = 0;
		int localInversionCount = 0;
		int length = nums.length;

		// O(n)
		for (int i = 1; i < length; i++) {
			if (nums[i - 1] > nums[i]) {
				localInversionCount++;
			}
		}

		// O(n^2)
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (nums[i] > nums[j]) {
					globalInversionCount++;
				}
			}
		}

		return globalInversionCount == localInversionCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,2};
		System.out.println(isIdealPermutation(nums));
	}

}
