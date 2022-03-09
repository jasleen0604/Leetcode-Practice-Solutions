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
     public ListNode deleteDuplicates(ListNode head) {
        ListNode ansHead = new ListNode();
        ListNode prev = ansHead, temp = head;;

                while (temp != null) {
                    ListNode current = temp;
                    temp = temp.next;
                    while (temp != null && current.val == temp.val) {
                        temp = temp.next;
                    }
                    if (current.next == temp) {
                        prev.next = current;
                        prev = current;
                        prev.next = null;
                    }
                }
           return ansHead.next;
    }
}