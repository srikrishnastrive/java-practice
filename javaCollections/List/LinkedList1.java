package List;
//linkedList

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(100);
        list.addLast(200);
        list.addLast(300);
        list.addFirst(500);
        list.forEach((Integer val)->System.out.println(val));
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,1000);
        list2.add(1,2000);
        list2.add(2,3000);
        list2.add(1,400);
        list2.forEach((Integer val)-> System.out.println(val));
    }
}
