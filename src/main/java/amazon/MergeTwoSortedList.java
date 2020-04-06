package amazon;

public class MergeTwoSortedList {

    /**
     *
     *
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     *
     * Example:
     *
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     * @param args
     */
    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

        Node head1 = new Node(1);
        head1.next = new Node(3);
//        head1.next.next = new Node(5);

        // 1.3.5 LinkedList created

        Node head2 = new Node(0);
        head2.next = new Node(2);
        head2.next.next = new Node(4);
//         0.2.4 LinkedList created

        Node mergedhead = merge(head1, head2);

    }

    private static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);

        Node head = dummy;
        while(head1 != null && head2 != null) {
            if(head1.value < head2.value) {
                dummy.next = head1;
                head1 = head1.next;
            } else {
                dummy.next = head2;
                head2 = head2.next;
            }

            dummy = dummy.next; // this dummy next will be head's first next pointer in first attempt and the pointer remains the same
        }

        if (head1 != null) {
            dummy.next = head1;
        } else {
            dummy.next = head2;
        }

        return  head.next;
    }

    private static class Node {
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }
    }
}
