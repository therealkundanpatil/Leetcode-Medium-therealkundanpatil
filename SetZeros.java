package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Medium
 * 
 * Id:  Set Zeros
 * 
 * Time Complexity : O(m.n)
 * Space Complexity : O(m.n)
 * 
 * @author Kundan
 *
 */
public class SetZeros {
    public void setZeroes(int[][] matrix) {
        // Iterate over the array and find the location of zeros and save it in Arraylist
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                
                List<Integer> sublist = new ArrayList<>();
                if(matrix[i][j] == 0){
                    sublist.add(i);
                    sublist.add(j);
                    list.add(sublist);
                }
                
            }
        }
        
        //Iterate over the array list, get the indexes
        for(int i = 0; i < list.size(); i++){
            
            int rowIndex = list.get(i).get(0);
            int columnIndex = list.get(i).get(1);
            
            // use row index, iterate over all the columns in that row and set their value to zero
            for(int column = 0; column < matrix[0].length; column++){
                matrix[rowIndex][column] = 0;
            }
            
            // use column index, iterate over all the rows in that column and set their value to zero
            for(int row = 0; row < matrix.length; row++){
                matrix[row][columnIndex] = 0;
            }
            
        }
    }
}
