package medium;

public class Search_In_a_Rotated_Array {
	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int middle = left + (right - left) / 2;

			if (nums[middle] == target) {
				return middle;
			} else if (nums[left] <= nums[middle]) {
				if (target >= nums[left] && target < nums[middle]) {
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			} else {
				if (target > nums[middle] && target <= nums[right]) {
					left = middle + 1;
				} else {
					right = middle - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 5;
		int position = search(nums, target);
		System.out.println(position);
		if (position != -1) {
			System.out.println("Found " + target + " at index " + position);
		}
	}

}
