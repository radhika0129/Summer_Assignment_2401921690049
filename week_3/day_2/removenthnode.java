class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class removenthnode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers together
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the node
        second.next = second.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        removenthnode obj = new removenthnode();

        // Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        ListNode result = obj.removeNthFromEnd(head, n);

        // Printing result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}