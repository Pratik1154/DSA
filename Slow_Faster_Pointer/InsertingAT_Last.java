package Slow_Faster_Pointer;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}
public class InsertingAT_Last {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        //new node
         Node newNode = new Node(5);

         Node pointer = head;
         while (pointer.next!=null) {
            pointer = pointer.next;
         }
         pointer.next=newNode;
         
         Node current = head;
         while (current!=null) {
            System.out.println(current.val);
            current=current.next;
         }
    }
}
