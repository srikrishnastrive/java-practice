import java.util.Iterator;
import java.util.TreeMap;

public class Tree_map{
    public static void main(String[] args){
        TreeMap<Integer,String> mp = new TreeMap<>();
        mp.put(12, "Vikram");
        mp.put(1, "Raj");
        mp.put(8, "Rima");
        mp.put(8, "Krishna");
        System.out.println(mp);
    
        System.out.println(mp.ceilingKey(2));

    }
}
