package medium;

/**
 * LeetCode Medium
 * 
 * Id:  Swap Two nodes in LinkedList
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class SwapTwoNodes {
	public ListNode swapPairs(ListNode head) {

		// Node situated before the two to-be-swapped nodes
		ListNode prevNode = new ListNode(0);

		prevNode.next = head;

		// Storing a reference for returning
		ListNode newHead = prevNode;

		while (prevNode.next != null && prevNode.next.next != null) {

			// Declare
			ListNode node1 = prevNode.next;
			ListNode node2 = node1.next;
			ListNode nextNode = node2.next;

			// Swap
			prevNode.next = node2;
			node2.next = node1;
			node1.next = nextNode;

			// Move
			prevNode = node1;
		}

		return newHead.next;
	}
}
