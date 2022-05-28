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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int idx = 0;
        ListNode temp = list1;
        ListNode attach = list1;
        while(idx != b+1)
        {
           attach = attach.next;
            idx++;
        }
        idx = 0;
     
        while(temp.next != null)
        {
            if(idx == a-1)
               temp.next = list2; 
            else
                temp = temp.next;
            idx++;    
        }
        temp.next = attach;
        return list1;
    }
}