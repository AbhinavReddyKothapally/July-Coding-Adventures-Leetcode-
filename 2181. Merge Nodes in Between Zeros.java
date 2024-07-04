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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        ListNode temp=head;
        ListNode temp1=temp;
        while(temp!=null)
        {
            while(temp.val!=0)
            {
                if(temp!=temp1)
                    temp1.val+=temp.val;
                temp=temp.next;
            }
            temp1.next=temp.next;
            temp=temp.next;
            temp1=temp;
        }
        return head;
        
    }
}
