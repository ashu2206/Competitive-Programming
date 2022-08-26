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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
           
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            current=current.next;
             
        }
        if(count==n)
            return head.next;
        ListNode temp=head;
        for(int i=1;i<count-n;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}