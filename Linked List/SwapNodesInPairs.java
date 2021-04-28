/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode current = newNode;
        
        while (current.next != null && current.next.next != null) {
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;
            
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            current.next = secondNode;
            current = firstNode;
            
        }
        
        return newNode.next;
    }
}