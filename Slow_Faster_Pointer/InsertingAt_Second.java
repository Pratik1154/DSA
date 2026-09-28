package Slow_Faster_Pointer;

class Node{
    int val;
    Node next;

    Node(int x){
        val = x;
        next=null;
    }
}

public class InsertingAt_Second {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //connecting nodes;
        head.next = n2;
        n2.next = n3;

        //Inserting new node at the second poistion
        Node n4 = new Node(4);
        // Node headAddress = head.next;

        n4.next = head.next;
        head.next = n4;
        

        Node pointer = head;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }

    }
}
