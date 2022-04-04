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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode left = head;
        int counter = 1;
        while(counter != k)
        {
            left = left.next;
            counter++;
        }
        
        ListNode right = head;
        ListNode lcopy = left;
        while(lcopy.next != null)
        {
            right = right.next;
            lcopy = lcopy.next;
        }
        
        int data = left.val;
        left.val = right.val;
        right.val = data;
        
        return head;
    }
}