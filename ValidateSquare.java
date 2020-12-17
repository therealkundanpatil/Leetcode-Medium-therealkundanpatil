package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Medium
 * 
 * Id:  Validate Square
 * 
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 * @author Kundan
 *
 */
public class ValidateSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Double> set = new HashSet<>();
        
        set.add(calculateDistance(p1,p2));
        set.add(calculateDistance(p1,p3));
        set.add(calculateDistance(p1,p4));
        set.add(calculateDistance(p2,p3));
        set.add(calculateDistance(p2,p4));
        set.add(calculateDistance(p3,p4));
        
        if(!set.contains(0.0) && set.size() == 2){
            return true;
        }
        return false;
    }
    
    public static double calculateDistance(int[] point1, int[] point2){
        return (point1[ 0 ] - point2[ 0 ]) * (point1[ 0 ] - point2[ 0 ]) + (point1[ 1 ] - point2[ 1 ]) * (point1[ 1 ] - point2[ 1 ]); 
    }
}
