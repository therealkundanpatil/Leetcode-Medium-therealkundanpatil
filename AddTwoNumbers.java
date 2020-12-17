package medium;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

/**
 * LeetCode Medium
 * 
 * Id : 2. Add Two Numbers
 * 
 * Time Complexity : O(n) Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Result is a new linked list therefore creating one
		ListNode l3 = new ListNode();
		// keep track of carry
		int carry = 0;
		// First operand
		int firstNumber = 0;
		// Second operand
		int secondNumber = 0;
		// If Digit greater than 10 then we obtain last digit it will be stored in this
		// variable
		int originalDigit = 0;
		// To track Head of the resulting list
		ListNode head = null;

		// Size of the two list can be different
		while (l1 != null || l2 != null) {

			// If number is present we obtain its value otherwise assume zero
			if (l1 != null) {
				firstNumber = l1.val;
			} else {
				firstNumber = 0;
			}

			// If number is present we obtain its value otherwise assume zero
			if (l2 != null) {
				secondNumber = l2.val;
			} else {
				secondNumber = 0;
			}

			// Add two numbers along with carry
			int computedSum = firstNumber + secondNumber + carry;

			// Create a node
			ListNode node = null;
			if (computedSum <= 9) {
				node = new ListNode(computedSum);
				carry = 0;
			} else {
				carry = computedSum / 10;
				originalDigit = computedSum % 10;
				node = new ListNode(originalDigit);
			}

			// Make it a part of Final list
			l3.next = node;

			// Check if head is null
			if (head == null) {
				head = node;
			}

			// Onto next node if not null
			if (l1 != null) {
				l1 = l1.next;
			}

			// Onto next node if not null
			if (l2 != null) {
				l2 = l2.next;
			}

			// Update the final list as well
			l3 = l3.next;
		}

		// Edge case if carry is not zero
		if (carry != 0) {
			ListNode node = new ListNode(carry);
			l3.next = node;
			l3 = l3.next;
		}

		// Return Head simply
		return head;
	}
}
