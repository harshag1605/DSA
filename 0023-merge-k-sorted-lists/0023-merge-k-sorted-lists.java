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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((i1,i2) -> i1.val-i2.val);
        for(ListNode h : lists){
            if(h != null)pq.add(h);
        }
        while(!pq.isEmpty()){
            ListNode h = pq.poll();
            tail.next = h;
            tail = h;
            h = h.next;
            if(h != null) pq.add(h);
        }
        return dummy.next;
    }
}