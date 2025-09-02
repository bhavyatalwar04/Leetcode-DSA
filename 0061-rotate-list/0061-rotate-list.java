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
    public ListNode rotateRight(ListNode head, int k) {

        while(head==null || head.next==null || k==0) return head;

        ListNode temp=head;
        int count=1;

        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        
        ListNode tail=temp;

        k=k%count;
        if(k==0) return head;

        count=count-k;
        ListNode newTail=head;
        while(count>1){
            newTail=newTail.next;
            count--;
        }

        ListNode newHead=newTail.next;
        newTail.next=null;
        tail.next=head;

        return newHead;
        



    }
}