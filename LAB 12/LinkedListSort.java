class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListSort {

    // Method to sort the linked list using Merge Sort
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: a list of zero or one node is already sorted
        }

        // Step 1: Split the list into two halves
        ListNode middle = getMiddle(head);
        ListNode nextToMiddle = middle.next;
        middle.next = null;

        // Recursively sort the sublists
        ListNode left = sortList(head);
        ListNode right = sortList(nextToMiddle);

        // Step 2: Merge the sorted halves
        return merge(left, right);
    }

    // Method to find the middle of the linked list
    private static ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Method to merge two sorted linked lists
    private static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.value <= right.value) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        // Attach the remaining elements
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create an example linked list: 4 -> 2 -> 3 -> 1 -> null
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);

        System.out.println("Original list:");
        printList(head);

        // Sort the list
        ListNode sortedList = sortList(head);

        System.out.println("Sorted list:");
        printList(sortedList);
    }
}
