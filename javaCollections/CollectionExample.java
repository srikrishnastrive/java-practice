import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating two Collections of String elements using ArrayList
        Collection<String> fruits = new ArrayList<>();
        Collection<String> moreFruits = new ArrayList<>();

        // Adding elements to the 'fruits' Collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Adding elements to the 'moreFruits' Collection
        moreFruits.add("Mango");
        moreFruits.add("Grapes");
        moreFruits.add("Banana");

        // addAll method: Adding all elements from 'moreFruits' to 'fruits'
        fruits.addAll(moreFruits);
        System.out.println("After addAll, 'fruits' collection: " + fruits);  // Output: [Apple, Banana, Orange, Mango, Grapes, Banana]

        // removeAll method: Removing all elements from 'fruits' that are in 'moreFruits'
        fruits.removeAll(moreFruits);
        System.out.println("After removeAll, 'fruits' collection: " + fruits);  // Output: [Apple, Orange]

        // equals method: Checking equality of two collections
        Collection<String> fruitsCopy = new ArrayList<>(fruits);
        System.out.println("Does 'fruits' equal 'fruitsCopy'? " + fruits.equals(fruitsCopy));  // Output: true

        // Modifying 'fruitsCopy' to make it different
        fruitsCopy.add("Pineapple");
        System.out.println("Does 'fruits' equal modified 'fruitsCopy'? " + fruits.equals(fruitsCopy));  // Output: false

        // clear method: Removing all elements from the 'fruits' collection
        fruits.clear();
        System.out.println("After clear, is 'fruits' empty? " + fruits.isEmpty());  // Output: true
    }
}
