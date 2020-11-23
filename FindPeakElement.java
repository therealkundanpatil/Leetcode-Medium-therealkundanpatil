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
        if(nums == null || nums.length == 1){
            return 0;
        }
        
        int peek = 0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                peek = i;
            }
        }
        
        return peek;
    }
}
