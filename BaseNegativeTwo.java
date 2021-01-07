package medium;

/**
 * LeetCode Medium
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * @author Kundan
 *
 */
public class BaseNegativeTwo {
	public String baseNeg2(int N) {
		if (N == 0) {
			return "0";
		}

		StringBuilder sb = new StringBuilder();
		int base = -2;

		while (N != 0) {
			int rem = N % base;
			N = N / base;

			if (rem < 0) {
				rem += 2;
				N += 1;
			}
			sb.append(rem);
		}

		return sb.reverse().toString();
	}
}
