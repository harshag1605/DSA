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
        if(head == null || head.next == null || k == 0) return head;
        int count = 1;
        ListNode t = head;
        while(t.next != null){
            count++;
            t = t.next;
        }
        k = k%count;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        int c = 1;
        while(c != count-k){
            fast = fast.next;
            c++;
        }
        ListNode newHead = fast.next;
        fast.next = null;
        ListNode temp = newHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = slow;
        return newHead;
    }
}