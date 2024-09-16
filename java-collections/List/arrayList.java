import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(20);
        aList.add(12);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(3));
    }
}
