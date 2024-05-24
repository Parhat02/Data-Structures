package main.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionQueueTasks {
    public static void main(String[] args) {

        Deque<Integer> deque=new ArrayDeque<>();

        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("John");
        pq.add("Michel");
        pq.add("Carol");
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove()); //Removing is in alphabetic order, because we didn't define any comparator

    }
}
