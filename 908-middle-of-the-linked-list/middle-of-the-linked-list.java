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
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return head;
        ListNode cur=head;
        int count=0;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        int middleIndex = count / 2;
        
        // Reset current pointer to the head
        cur = head;
        
        // Traverse to the middle node
        for (int i = 0; i < middleIndex; i++) {
            cur = cur.next;
        }
        
        return cur;
    }
}
