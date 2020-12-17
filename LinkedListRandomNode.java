package medium;

import java.util.Random;

/**
 * LeetCode Medium
 * 
 * Id :382 		LinkedList Random Node
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class LinkedListRandomNode {
	ListNode list;
	int size;
	/**
	 * @param head The linked list's head. Note that the head is guaranteed to be
	 *             not null, so it contains at least one node.
	 */
//    public Solution(ListNode head) {
//        list = head;
//        ListNode currentNode = list;
//        while(list != null){
//            list = list.next;
//            size++;
//        }
//        list = head;
//    }

	/** Returns a random node's value. */
	public int getRandom() {
		Random random = new Random();
		int indexValue = random.nextInt(size);

		int counter = 0;
		ListNode temp = list;
		while (temp != null) {
			if (counter == indexValue) {
				break;
			}
			temp = temp.next;
			counter++;

		}

		return temp.val;
	}
}
