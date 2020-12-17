package medium;

/**
 * LeetCode Medium
 * 
 * Id: 650 	Two KeyBoards
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class TwoKeyboards {
	public int minSteps(int n) {
		if (n == 1) {
			return 0;
		}

		int totalWrittenChars = 1;
		int operations = 0;
		int copy_count = 0;

		while (totalWrittenChars < n) {
			if (n % totalWrittenChars == 0) {
				operations += 2; // copy all and paste
				copy_count = totalWrittenChars;
				totalWrittenChars *= 2; // increases by factor of 2
			} else {
				operations += 1; // Paste only
				totalWrittenChars += copy_count; // size increases by the copy count
			}
		}

		return operations;
	}
}
