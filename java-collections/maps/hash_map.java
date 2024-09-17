import java.util.HashMap;

/**
 * Java HashMap is similar to HashTable, but it is unsynchronized. 
 * It allows to store the null keys as well, but there should be only one null key object and there can be
 *  any number of null values. This class makes no guarantees as to the order of the map. To use this class
 *  and its methods, you need to import java.util.HashMap
 *  package or its superclass.
 */
public class hash_map {
    public static void main(String[] args) {
      
      // Create a HashMap
      HashMap<String, Integer> hashMap = new HashMap<>();
      
      // Add elements to the HashMap
      hashMap.put("John", 25);
      hashMap.put("Jane", 30);
      hashMap.put("Jim", 35);
      
      // Access elements in the HashMap
      System.out.println(hashMap.get("John")); 
      // Output: 25
      
      // Remove an element from the HashMap
      hashMap.remove("Jim");
      
      // Check if an element is present in the HashMap
      System.out.println(hashMap.containsKey("Jim")); 
      // Output: false
      
      // Get the size of the HashMap
      System.out.println(hashMap.size()); 
      // Output: 2
   }
}
