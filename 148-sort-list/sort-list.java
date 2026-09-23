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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
            ListNode right = slow.next;
            slow.next = null;
            ListNode leftSorted = sortList(head);
            ListNode rightSorted = sortList(right);

            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            while(leftSorted != null && rightSorted != null){
                if(leftSorted.val < rightSorted.val){
                    curr.next = leftSorted;
                    leftSorted = leftSorted.next;
                }
                else{
                    curr.next = rightSorted;
                    rightSorted = rightSorted.next;
                }
                curr = curr.next;
            }
            if(leftSorted!=null){
                curr.next = leftSorted;
            }
            if(rightSorted!=null){
                curr.next = rightSorted;
            }
            return dummy.next;
    }
 }