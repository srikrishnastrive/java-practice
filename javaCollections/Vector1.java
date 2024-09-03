import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(0, 100);
        list.add(1,300);
        list.addFirst(400);
        System.out.println(list.get(0));
        list.forEach((Integer val)-> System.out.println(val));
    }
}
