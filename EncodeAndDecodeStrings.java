package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Medium
 * 
 * Id: 		Encode and Decode Strings
 * 
 * Time Complexity : O(n2)  
 *  
 * Space Complexity : O(n)
 * @author Kundan
 *
 */
public class EncodeAndDecodeStrings {
	// Encodes a list of strings to a single string.
	public String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			sb.append("" + str.length() + "$" + str);
		}

		return sb.toString();
	}

	// Decodes a single string to a list of strings.
	public List<String> decode(String s) {
		List<String> decodedWordsList = new ArrayList<>();
		int totalLength = s.length();
		int i = 0;
		while (i < totalLength) {
			int dollarIndex = s.indexOf('$', i);
			int stringLength = Integer.parseInt(s.substring(i, dollarIndex));
			String word = s.substring(dollarIndex + 1, dollarIndex + 1 + stringLength);
			decodedWordsList.add(word);
			i = dollarIndex + 1 + stringLength;
		}

		return decodedWordsList;
	}
}
