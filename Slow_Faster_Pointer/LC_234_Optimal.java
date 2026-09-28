package Slow_Faster_Pointer;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LC_234_Optimal {
     public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    public static boolean isPalindrom(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
            if (fast != null) {
            slow = slow.next;
                }


        ListNode newHead = reverse(slow);

        ListNode first = head;
        ListNode second = newHead;

        while (second!=null) {
            if(first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

   

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        // connecting nodes
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        if (isPalindrom(head))
            System.out.println("Palindrom LL");
        else
            System.out.println("not palindrom");
    }

}
