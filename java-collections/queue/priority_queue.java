import java.util.PriorityQueue;

public class priority_queue {
    //min Heap
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(10);
        pq.offer(5);
        pq.offer(4);
        while (pq.isEmpty() == false) {
            System.out.println(pq.peek());
            pq.poll();
        }
}
}
