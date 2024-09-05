package queue;
import java.util.*;
//we don't change in the method comparator
public class comparator_1 {
    public static void main(String[] args) {
        Integer a[] = {6,4,1,9,2,11};
        Arrays.sort(a,(Integer val1,Integer val2) -> val2-val1);
        for (int v : a){
            System.out.println(v);
        }
    }
}
