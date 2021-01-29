package medium;

/**
 * LeetCode Medium
 * 
 * Id : 61		Rotate List
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 *   
 * @author Kundan
 *
 */
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		/*
		 * Compute size of the data
		 */
		int size = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}

		/*
		 * Prepare Matrix of the previous computed size and store all the data
		 */
		int[] data = new int[size];
		int dataIndex = -1;

		currentNode = head;
		while (currentNode != null) {
			data[++dataIndex] = currentNode.val;
			currentNode = currentNode.next;
		}

		/*
		 * If k not in range, try to bring it in range
		 */
		while (k > data.length) {
			k %= data.length;
		}
		/*
		 * Rotate the data inside the array
		 */
		for (int shift = 1; shift <= k; shift++) {
			int temp = data[data.length - 1];
			for (int i = data.length - 1; i > 0; i--) {
				data[i] = data[i - 1];
			}
			data[0] = temp;
		}

		/*
		 * Replace the data in the old list with the new data in the array
		 */

		currentNode = head;
		int index = 0;
		while (currentNode != null) {
			currentNode.val = data[index];
			currentNode = currentNode.next;
			index++;
		}

		return head;
	}
}
