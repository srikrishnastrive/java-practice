package queue;
import java.util.*;

public class Minimum_priorityQueue_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(5);
        minPq.add(2);
        minPq.add(8);
        minPq.add(1);

        minPq.forEach((Integer val)-> System.out.println(val));
        while (!minPq.isEmpty()) {
            int val = minPq.poll();
            System.out.println("remove from the top "+val);
            
        }
    }
}
