import java.util.*;
public class Max_priorityQueue_2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        maxPq.add(8);
        maxPq.add(2);
        maxPq.add(5);
        maxPq.add(10);
        maxPq.add(1);

        maxPq.forEach((Integer val)-> System.out.println(val));
        while(!maxPq.isEmpty()){
            int val = maxPq.poll();
            System.out.println("remove from top"+val);
        }
    }   
}
