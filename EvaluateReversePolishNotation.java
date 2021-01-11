package medium;

import java.util.Stack;

/**
 * LeetCode Medium
 * 
 * Id:  Evaluate Reverse Polish Notation
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * 
 * @author Kundan
 *
 */
public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		if (tokens == null || tokens.length == 0) {
			return -1;
		}

		Stack<Integer> stack = new Stack<>();
		int num1 = 0;
		int num2 = 0;

		for (String token : tokens) {
			if (token.equals("+")) {
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num1 + num2);
			} else if (token.equals("-")) {
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num2 - num1);
			} else if (token.equals("*")) {
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num2 * num1);
			} else if (token.equals("/")) {
				num1 = stack.pop();
				num2 = stack.pop();
				stack.push(num2 / num1);
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}
