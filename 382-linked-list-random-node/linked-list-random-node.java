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
    Random rnd=new Random();
    List<Integer> values=new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
        
    }
    
    public int getRandom() {
        int n=values.size();
        int index=rnd.nextInt(n);
        return values.get(index);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */