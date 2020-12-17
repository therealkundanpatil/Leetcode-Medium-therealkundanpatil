package medium;

/**
 * LeetCode Medium
 * 
 * Id : 238		 Product of Array Except Self
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] product_left = new int[nums.length];
        int[] product_right = new int[nums.length];
        
        product_left[ 0 ] = 1;
        product_right[ nums.length -1 ] = 1;
        
        for( int i = 1; i < nums.length; i++ ){
            product_left[ i ] = product_left[ i - 1 ] * nums[ i - 1 ];
        }
        
        for( int i = nums.length - 2 ;i >= 0; i-- ){
            product_right[ i ] = product_right[ i + 1 ] * nums[ i + 1 ];
        }
        
        

        for( int i = 0; i < nums.length; i++){
           nums[i] = product_left[i] * product_right[i]; 
        } 
        
        return nums;
    }
}
