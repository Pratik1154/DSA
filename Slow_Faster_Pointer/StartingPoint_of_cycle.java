package Slow_Faster_Pointer;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class StartingPoint_of_cycle {

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);// start point
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);

        // connecting nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // connect to make it cyclic
        node5.next = node3;

        ListNode result = detectCycle(head);

        if (result != null) {
            System.out.println("Cycle start at " + result.val);
        } else {
            System.out.println("No Cycle");
        }
    }
}
