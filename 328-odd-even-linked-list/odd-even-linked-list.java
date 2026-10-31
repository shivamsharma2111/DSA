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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp1=head;
        ListNode temp2=head;
        ListNode temp3=head.next;
        ListNode head2=temp3;
        temp1=temp3.next;
        int count=0;
        while(temp1!=null){
            if(count==0){
                temp2.next=temp1;
                temp2=temp2.next;
                count=1;
            }
            else{
                temp3.next=temp1;
                temp3=temp3.next;
                count=0;

            }
            temp1=temp1.next;
        }
        temp2.next=head2;
        temp3.next=null;
        return head;
    }
}