package Slow_Faster_Pointer;

import java.util.ArrayDeque;
import java.util.Deque;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
        next=null;
    }
}
public class LC_234_PalindromLL {

    public static boolean isPalindrom(ListNode head){
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode temp = head;

        while (temp!=null) {
            stack.push(temp.val);
            temp=temp.next;
        }

        temp=head;
        while (temp!=null) {
            if(temp.val!=stack.peek()){
                return false;
            }
            temp=temp.next;
            stack.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        //connecting nodes 
        head.next = n2;
        n2.next = n3;
        n3.next=n4;

       if(isPalindrom(head)) System.out.println("Palindrom LL");
        else System.out.println("not palindrom");
    }
}
