import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
         //Ds structure stores data structures in a random order in sorted order -- 0(log N)
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(9);
        ts.add(1);
        ts.add(4);
        System.out.println(ts);
        System.out.println(ts.floor(8)); //<= 4
        System.out.println(ts.ceiling(8)); //>= 8
        
    }
}
