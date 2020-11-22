package medium;

/**
 * LeetCode Medium
 * 
 * Id : 151		Reverse words in a String
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
public class ReverseWordsInAString {
	public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        
        StringBuilder toReturn = new StringBuilder();
        for(int i = words.length-1; i > 0; i-- ){
            toReturn.append(words[i] + " ");
        }
        toReturn.append(words[0]);
        
        return toReturn.toString();
    }
}
