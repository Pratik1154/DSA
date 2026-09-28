package Slow_Faster_Pointer;

class Node{
    int val;
    Node next;

    Node(int x){
        val = x;
        next=null;
    }
}

public class Inserting_At_Begning {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //connecting nodes;
        head.next = n2;
        n2.next = n3;

    // Insert the new node at first whos value is 4;

        Node n4 = new  Node(4);
        n4.next=head;
        head = n4;

        Node pointer = head;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }

    }
}
