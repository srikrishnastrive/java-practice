//vector is a thread safe

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer>  vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.insertElementAt(3, 1);
        vec.removeElement(2);

        for (int i : vec){
            System.out.println(i);
        }
    }
   
   
}
