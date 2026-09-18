package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        // =========================
        // Queue using LinkedList
        // =========================

        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.offer("Ken");
        queue.offer("Alice");
        queue.offer("Bob");

        System.out.println("Queue: " + queue);

        // Look at the first element without removing it
        System.out.println("Front: " + queue.peek());

        // Remove the first element
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        // Look at the new first element
        System.out.println("Front: " + queue.peek());

        // Check size
        System.out.println("Size: " + queue.size());

        // Check whether an element exists
        System.out.println("Contains Bob: " + queue.contains("Bob"));


        // =========================
        // Process the remaining queue
        // =========================

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }


        // =========================
        // PriorityQueue
        // =========================

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(50);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue: " + priorityQueue);

        System.out.println("Next: " + priorityQueue.poll());
        System.out.println("Next: " + priorityQueue.poll());
        System.out.println("Next: " + priorityQueue.poll());
    }
}
