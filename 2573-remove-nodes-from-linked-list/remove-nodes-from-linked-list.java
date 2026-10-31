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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        ListNode t=prev;
        ListNode h=prev;
        prev=prev.next;
        while(prev!=null){
            if(t.val>prev.val){
                t.next=prev.next;
            }
            else{
                t=t.next;
            }
            prev=prev.next;
        }
        ListNode c2=h;
        ListNode p2=null;
        while(c2!=null){
            ListNode ne=c2.next;
            c2.next=p2;
            p2=c2;
            c2=ne;
        }
        return p2;
    }
}