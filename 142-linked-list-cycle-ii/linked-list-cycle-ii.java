/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            break;
        }
        if(slow!=fast)
        return null;
        ListNode P=head;
        while(P!=slow){
            P=P.next;
            slow=slow.next;
        }
        return P;
        
    }
}