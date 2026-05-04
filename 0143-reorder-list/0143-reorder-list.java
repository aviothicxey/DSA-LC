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
    public void reorderList(ListNode head) {
         if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        //move slow till mid:
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //split into two halves:
        ListNode newHead = slow.next;
        slow.next = null;
        //reverse second half:
        ListNode prev = null;
        ListNode curr = newHead;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        //now prev == head of reversed
        ListNode head1 = head;
        ListNode head2 = prev;

        while(head1 != null && head2 != null){
            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;

            head1.next = head2;
            head2.next = temp1;

            head1 = temp1;
            head2 = temp2;
        }        
    }
}