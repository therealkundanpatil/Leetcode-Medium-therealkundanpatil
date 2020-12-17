package medium;

/**
 * LeetCode Medium
 * 
 * Id:  Remove Nth Node from the End
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class RemoveNthNodeFromTheEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        int size = computeSize(currentNode);
        
        currentNode = head;
        // Till this index, I want every node
        int targetIndex = size - n - 1;
        
        // Edge Case, If we need to remove head
        if(size == n){
            return head.next;
        }
        else{
            while(targetIndex > 0){
                currentNode = currentNode.next;
                targetIndex--;
            }
            //Skip the next node and all the subsequent ones are part of the answer
            currentNode.next = currentNode.next.next;

            return head;    
        }
        
    }
    
    private static int computeSize(ListNode currentNode){
        int size = 0;
        while(currentNode != null){
            ++size;
            currentNode = currentNode.next;
        }
        return size;
    }
}
