//List inside arraylist
import java.util.*;
public class ArrayList_1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        //addAll(int index,collection);
        List<Integer> list2 = new ArrayList<>();
        list2.add(0,400);
        list2.add(1, 500);
        list2.add(2, 600);
        list1.addAll(2,list2);
        list1.forEach((Integer val)-> System.out.println(val));

        //replaceAll(uninaryOperator op);
        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("after repacing all");
        list1.forEach((Integer val)-> System.out.println(val));

        //sort comparator
        list1.sort((Integer val1,Integer val2)-> val1- val2);
        System.out.println("after sorting in increasing order");
        list1.forEach((Integer val)-> System.out.println(val));
        //getIndex
        System.out.println("value present at index 2"+list1.get(2));
        //setIndex
        list1.set(2, -4000);
        System.out.println("after set method");
        list1.forEach((Integer val)-> System.out.println(val));
    }
}
