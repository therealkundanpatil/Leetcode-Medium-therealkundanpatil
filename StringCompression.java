package medium;

/**
 * LeetCode Medium
 * 
 * Id: 443		   String COmpression
 * 
 * Time Complexity : O()
 * 
 * Space Complexity : O()
 * 
 * 
 * @author Kundan
 *
 */
public class StringCompression {
	public int compress(char[] chars) {
		if (chars.length == 1) {
			return 1;
		}
		
		//String Builder faster and efficient than String
		StringBuilder compressedString = new StringBuilder("");
		int modifiedIndexCounter = -1;
		
		// Add first unique Character
		char newCharacter = chars[0];
		compressedString.append(String.valueOf(newCharacter));
		chars[++modifiedIndexCounter] = newCharacter;
		
		for (int letterIndex = 1; letterIndex < chars.length;) {
			//compare the recently added unique character with the other characters
			int groupCount = 1;
			while (letterIndex < chars.length && newCharacter == chars[letterIndex]) {
				letterIndex++;
				groupCount++;
			}

			// Count logic 
			if (groupCount > 1) {
				compressedString.append(groupCount);
				// Adding count to input array as it is --> if count greater than 1 and less than equal to 9
				if (groupCount > 1 && groupCount <= 9) {
					chars[++modifiedIndexCounter] = (char) (groupCount + '0');
				}

				// otherwise split the count
				else if (groupCount > 9) {
					String groupCounter = String.valueOf(groupCount);
					char[] ch = groupCounter.toCharArray();
					for (int countIndex = 0; countIndex < ch.length; countIndex++) {
						chars[++modifiedIndexCounter] = ch[countIndex];
					}
				} else {

				}
			}

			// Saving the next unique character
			if (letterIndex < chars.length) {
				// Adding a new Character
				newCharacter = chars[letterIndex];
				chars[++modifiedIndexCounter] = newCharacter;
				compressedString.append(String.valueOf(newCharacter));
			}
			letterIndex++;
		}

		return compressedString.toString().length();
	}
}
