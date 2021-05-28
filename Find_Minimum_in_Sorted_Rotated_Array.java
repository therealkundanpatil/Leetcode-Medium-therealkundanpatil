package medium;

public class Find_Minimum_in_Sorted_Rotated_Array {
    public static int findMin(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length == 2){
            return nums[0] < nums[1] ? nums[0]:nums[1];
        }
        else{
            int left = 0;
            int right = nums.length - 1;
        
        
            while(left <= right){
                int middle = left + (right - left) / 2;

                if(nums[left] <= nums[middle]){
                    minimum = Math.min(minimum, nums[left]);
                    left = middle + 1;
                }
                else{
                    minimum = Math.min(minimum, nums[middle]);
                    right = middle - 1;
                }
            }   
        }
        
        return minimum;
    }

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int minElement = findMin(nums);
		System.out.println("Minimum : "+ minElement);
	}
}
