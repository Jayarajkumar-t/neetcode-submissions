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
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)return false;
        ListNode t=head,t1=head.next;
        while(t!=null&&t1!=null&&t1.next!=null)
        {
            if(t==t1)return true;
            t=t.next;
            //if(t1.next!=null)
            t1=t1.next.next;
        }
        return false;
    }
}
