package medium;

/**
 * LeetCode Medium
 * 
 * Id: 1060	Missing Number in a Sorted Array
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class MissingElementInSortedArray {
    public int missingElement(int[] nums, int k) {
        int difference = 0;
        int length = nums.length;
        for( int i = 1; i < length; i++ ){
            difference = nums[i] - nums[i-1] - 1;
            if(difference >= k){
                return nums[ i - 1 ] + k;
            }
            
            k -= difference;
        }
        
        return nums[ length - 1 ] + k;
    }
}
