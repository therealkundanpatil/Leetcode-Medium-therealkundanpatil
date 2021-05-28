package medium;

public class Search_In_A_Rotated_Array_2 {
	public static boolean search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int middle = left + (right - left) / 2;

			if (nums[middle] == target || nums[right] == target) {
				return true;
			} 
			
			if (nums[left] < nums[middle]) {
				if (target >= nums[left] && target < nums[middle]) {
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			} 
			else if(nums[middle] > nums[left]){
				if (target > nums[middle] && target <= nums[right]) {
					left = middle + 1;
				} else {
					right = middle - 1;
				}
			}
			else {
				right--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 5;
		boolean isPresent = search(nums, target);
		if (isPresent) {
			System.out.println("Target is present in the input array");
		}
		else {
			System.out.println("Target is not present in the input array");
		}
	}
}
