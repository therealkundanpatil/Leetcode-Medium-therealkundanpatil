package medium;

import java.util.Arrays;

/**
 * LeetCode Medium
 * 
 * ID : 877		Stone Game
 * 
 * Time Complexity : O(n*log(n))
 * 
 * Space Complexity : O(1)
 * @author Kundan
 *
 */
public class StoneGame {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        for(int i=0,j = piles.length - 1; i < piles.length / 2; i++,j--){
            int temp = piles[i];
            piles[i] = piles[j];
            piles[j] = temp;
        }
        
        int alexScore = 0;
        int leeScore = 0;
        
        for( int i = 0; i < piles.length - 1; i += 2){
            alexScore += piles[ i ];
            leeScore += piles[ i + 1 ];
        }
        
        if(alexScore > leeScore){
            return true;
        }
        return false;
    }
}
