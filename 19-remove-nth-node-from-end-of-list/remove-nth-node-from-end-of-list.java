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
        ListNode cur = head;
        int len = 0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        if(n==len){
            return head.next;
        }
        int targetIndex = len - n;
        cur = head;
        for(int i=1;i<targetIndex;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
        
        

    }
}