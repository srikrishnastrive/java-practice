import java.util.ArrayList;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(20);
        aList.add(12);
        Collections.sort(aList,(num1,num2)-> num1 - num2);

        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(3));
    }
}
