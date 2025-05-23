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
    public ListNode mergetwosortedlists(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
              l1.next=mergetwosortedlists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergetwosortedlists(l1,l2.next);
            return l2;
        }
        
    } 
    public ListNode partitionandmerge(int s,int e,ListNode[] lists){
        if(s>e){
            return null;
        }
        if(s==e){
            return lists[s];
        }
        int mid=s+(e-s)/2;
        ListNode L1=partitionandmerge(s,mid,lists);
        ListNode L2=partitionandmerge(mid+1,e,lists);
        return mergetwosortedlists(L1,L2);

    }
    
       public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0){
            return null;
        }
        return  partitionandmerge(0,k-1,lists);
        
        
    }
}