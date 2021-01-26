package medium;

/**
 * LeetCode Medium
 * 
 * Id:		Multiply Strings
 * 
 * Time Complexity : O(n2)
 * 
 * Space Complexity : O(m+n) ....where m--> length of first number and n --> length of second number
 * 
 * 
 * @author Kundan
 *
 */
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int m = num1.length();
		int n = num2.length();

		int[] res = new int[m + n];

		for (int i = m - 1; i >= 0; i--) {
			int number1 = num1.charAt(i) - '0';
			for (int j = n - 1; j >= 0; j--) {
				int mul = (num2.charAt(j) - '0') * number1;
				int sum = res[i + j + 1] + mul;
				res[i + j] = res[i + j] + sum / 10;
				res[i + j + 1] = sum % 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int val : res) {
			if (sb.length() != 0 || val != 0) {
				sb.append(val);
			}
		}
		return (sb.length() == 0) ? "0" : sb.toString();
	}
}
