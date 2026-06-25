class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class palindromelinkedlist {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Find middle node
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow);

        // Compare both halves
        ListNode firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Function to reverse linked list
    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }


    public static void main(String[] args) {

        palindromelinkedlist obj = new palindromelinkedlist();

        // Linked List: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(obj.isPalindrome(head));
    }
}