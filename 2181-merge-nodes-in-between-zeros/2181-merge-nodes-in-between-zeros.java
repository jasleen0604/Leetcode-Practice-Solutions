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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode result = new ListNode(-1);
        ListNode resHead = result;
        int sum = 0;
        while(temp!=null)
        {
            if(temp.val == 0)
            {
                ListNode newNode = new ListNode(sum);
                sum =0;
                result.next = newNode;
                result = result.next;
            }
            else
            {
                sum += temp.val;
            }
            temp = temp.next;
        }
        return resHead.next;
    }
}