public class ReverseLinkedList {
    public static void main(String[] args) {

        Node head = new Node(1);
       Node node1 = new Node(3);
       Node node2 = new Node(5);
       Node node3 = new Node(0);
       Node node4 = new Node(2);
        Node node5 = new Node(4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // 1.3.5 LinkedList created

        reverseLinedList(head);
    }

    private static Node reverseLinedList(Node head) {
        // 1->3->5->0->2->4
        // 4->2->0->5->3->1

        Node next;
        Node current = new Node(head.value);
        Node temp;
        while (head != null) {

            next = head.next ;
            if(next != null) {
                temp = current;
                current = new Node(next.value);
                current.next = temp;
                head = head.next;
            }
        }

        return current;

    }

    private static class Node {
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }
    }
}
