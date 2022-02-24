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
        private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(left != null && right != null) {
            if(left.val < right.val) {
                temp.next = left;
                left = left.next;
            }
            else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left != null) temp.next = left;
        if(right != null) temp.next = right;
        return dummy.next;
    }
    private ListNode getMiddleNode(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
    private ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode left = head;
        ListNode mid = getMiddleNode(head);
        ListNode right = mid.next;
        mid.next = null;
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}