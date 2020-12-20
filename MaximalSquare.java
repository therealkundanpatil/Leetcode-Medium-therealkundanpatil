package medium;

/**
 * LeetCode Medium
 * 
 * Id : 221		Maximal Square
 * 
 * Time Complexity : O(n3)
 * 
 * Space Complexity : O(1)
 * 
 * Brute Force Approach 
 *  
 * @author Kundan
 *
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
		int rowLimit = matrix.length;
        int coloumnLimit = matrix[0].length;
        
        for( int size = matrix.length; size > 0; size-- ){
            if( checkAllSquaresOfSize( matrix, size, rowLimit, coloumnLimit ) ){
                return size * size;
            }
        }
        return 0;
    }
    
    private static boolean checkAllSquaresOfSize( char[][] matrix, int size, int rowLimit, int columnLimit ){
        for( int row = 0; (row + size - 1) < rowLimit; row++ ){
            for( int column = 0; (column + size - 1) < columnLimit; column++ ){
                if( checkThisMatrix(matrix, size, row, column) ){
                    return true;
                }
            }
        }
		return false;
    }
    
    private static boolean checkThisMatrix( char[][] matrix, int size, int startRow, int startColumn ){
        for( int row = startRow; row < startRow + size; row++ ){
            for( int column = startColumn; column < startColumn + size; column++ ){
                if( matrix[ row ][ column ] == '0' ){
                    return false;
                }
            }
        }
        
        return true;
    }
}
