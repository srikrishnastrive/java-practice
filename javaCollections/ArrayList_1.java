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
        //remove(int index)
        list1.remove(2);
        System.out.println("after removing");
        list1.forEach((Integer val)-> System.out.println(val));
        //indexOf(Object o)
        System.out.println("index of -100 "+list1.indexOf(-100));

        //need to provide the index in listIterator,from where it has to start
       
        // Initialize the iterator to the start of the list
        ListIterator<Integer> listIterator2 = list1.listIterator();

        // Traversing forward direction
        while (listIterator2.hasNext()) {
            int val = listIterator2.next();
            System.out.println("traverse forward: " + val + " nextIndex: " + listIterator2.nextIndex() + " previous index " + listIterator2.previousIndex());
            if (val == -200) {
                listIterator2.add(-100);
            }
        }

        // Traverse the list using listIterator2 after modification
        System.out.println("list using listIterator2 after modification");
        listIterator2 = list1.listIterator(); // Reset the iterator to the start of the list
        while (listIterator2.hasNext()) {
            int val = listIterator2.next();
            System.out.println(val);
        }
        list1.forEach((Integer val) -> System.out.println(val));

    }
}
