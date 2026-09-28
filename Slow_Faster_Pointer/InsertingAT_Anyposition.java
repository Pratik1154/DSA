package Slow_Faster_Pointer;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class InsertingAT_Anyposition {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        // connecting nodes
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        // new node
        Node newNode = new Node(5);
        int poistion = 3, count = 0;
        ;

        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.val + "-->");
            pointer = pointer.next;
            count++;

            if (count == poistion - 1) {
                newNode.next = pointer;
                pointer = newNode;
            }

        }

    }
}
