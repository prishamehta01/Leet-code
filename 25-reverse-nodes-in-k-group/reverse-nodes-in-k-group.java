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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGrpEnd = dummy;
        while(true){
            ListNode kth = prevGrpEnd;
            for(int i=0;i<k && kth!=null;i++){
                kth = kth.next;
            }
            if(kth == null) break;
            ListNode grpStart = prevGrpEnd.next;
            ListNode nextGrpStart = kth.next;
            ListNode cur = grpStart;
            ListNode prev = nextGrpStart;
            while(cur!=nextGrpStart){
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            prevGrpEnd.next = prev;
            prevGrpEnd = grpStart;
        }
        return dummy.next;
    }
}