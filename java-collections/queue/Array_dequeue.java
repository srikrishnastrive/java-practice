/*
 * Queue
 * 1.ArrayDequeue
 * 2.LinkedList 
 * 3.priorityQueue
 */

import java.util.ArrayDeque;

public class Array_dequeue{
    public static void main(String[] args) {
      //insert from the first and last
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(12);
        ad.offer(9);
        ad.offer(10);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad.peek());
    }
 }
