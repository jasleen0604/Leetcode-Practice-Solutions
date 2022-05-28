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
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
       return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //mid point
        while(fast.next!=null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp1 = head;
        ListNode rev = slow.next;
        slow.next = null;
        ListNode temp2 = reverseList(rev);
        
        int maxsum = 0;
        while(temp1 != null && temp2 != null)
        {
            int sum = temp1.val + temp2.val;
            maxsum = Math.max(maxsum,sum);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return maxsum;
            
    }
}