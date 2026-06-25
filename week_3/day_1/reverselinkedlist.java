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
class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);

        head.next.next = head; // reverse
        head.next = null;      // break link

        return newHead;
    }
}