package amazon;

import java.util.HashMap;

public class CopyLinkWithRandomPointer {

    /**
     * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
     *
     * Return a deep copy of the list.
     *
     * The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of
     * [val, random_index] where:
     *
     * val: an integer representing Node.val
     * random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.
     *
     *
     * Example 1:
     *
     *
     * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * Example 2:
     *
     *
     * Input: head = [[1,1],[2,1]]
     * Output: [[1,1],[2,1]]
     * Example 3:
     *
     *
     *
     * Input: head = [[3,null],[3,0],[3,null]]
     * Output: [[3,null],[3,0],[3,null]]
     * Example 4:
     *
     * Input: head = []
     * Output: []
     * Explanation: Given linked list is empty (null pointer), so return null.
     *
     *
     * Constraints:
     *
     * -10000 <= Node.val <= 10000
     * Node.random is null or pointing to a node in the linked list.
     * Number of Nodes will not exceed 1000.
     * @param args
     */
    public static void main(String[] args) {
        Node node = new Node(7);

        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node;
        node2.random = node4;
        node3.random = node2;
        node4.random = node;


        copyLink(node);
    }

    private static Node copyLink(Node node) {
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node newNode = new Node(node.val);
        map.put(node, newNode);

        Node p =node;
        Node q = newNode;

        p = p.next;
        while (p != null) {
            Node temp = new Node(p.val);
            map.put(p, temp);
            q.next = temp;
            q = q.next;
            p = p.next;
        }

        p = node;
        q = newNode;

        while (p != null) {
           if(p.random != null) {
               q.random = map.get(p.random);
           } else {
              q.random = null;
           }

           q= q.next;
           p = p.next;
        }

        return newNode;
    }


    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
