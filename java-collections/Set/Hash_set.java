import java.util.HashSet;

public class Hash_set{
    public static void main(String[] args){

        //Ds structure stores data structures in a random order in unsorted way -- 0(1)
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        hs.remove(2);
        for (var num:hs){
            System.out.println(num);
        }

    }
}
