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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;
        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy,cur = head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        while(count>=k){
            cur = prev.next;
            ListNode next = cur.next;
            for(int i=1;i<k;i++){
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }
            prev = cur;
            count-=k;
        }
        return dummy.next;
    }
}