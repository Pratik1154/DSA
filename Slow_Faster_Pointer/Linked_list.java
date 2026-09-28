package Slow_Faster_Pointer;
import java.util.*;

public class Linked_list {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.get(0));

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
