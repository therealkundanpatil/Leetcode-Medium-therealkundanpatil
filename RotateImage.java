package medium;

/**
 * LeetCode Medium 
 * 
 * Id : 48		Rotate Image
 * 
 * Time Complexity : O(n2)
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
		// Transpose operation
        for( int i = 0; i < matrix.length; i++ ){
            int temp = Integer.MIN_VALUE;
            for( int j = i; j < matrix[i].length; j++ ){
                if(i != j){
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }            
            } 
        }
        
        // Flip each row completely
        for( int i = 0; i < matrix.length; i++ ){
            int temp = Integer.MIN_VALUE;
            for(int j = 0, k = matrix[i].length-1; j < matrix[i].length/2 ;j++,k--){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
}
