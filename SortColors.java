package medium;

/**
 * LeetCode Medium
 * 
 * Id : 75		Sort Colors
 * 
 * Time Complexity : O(n2)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int length = nums.length - 1;
        for( int i = 0; i < length; i++ ){
            int minIndex = i;
            for( int j = i + 1; j <= length; j++ ){
                if( nums[ j ] < nums[ minIndex ] ){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
