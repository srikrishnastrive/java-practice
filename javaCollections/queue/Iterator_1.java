package queue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // Using iterator
        System.out.println("Iterating the values using iterator method");
        Iterator<Integer> valuesIterator = values.iterator(); // Corrected: Initialize the iterator
        while (valuesIterator.hasNext()) {
            int val = valuesIterator.next();
            System.out.println(val);
            if (val == 3) {
                valuesIterator.remove(); // Removing the element while iterating
            }
        }

        // Iterating the values using for-each loop
        System.out.println("Iterating the values using for-each loop");
        for (int val : values) {
            System.out.println(val);
        }

        // Using forEach method
        System.out.println("Testing forEach method");
        values.forEach(val -> System.out.println(val)); // Corrected: Fixed lambda syntax
    }
}
