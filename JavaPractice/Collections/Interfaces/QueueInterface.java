// Queue Interface - FIFO (First In First Out) Collection
// Implementations: LinkedList, PriorityQueue, ArrayDeque, ConcurrentLinkedQueue
// Key Methods Documentation

package Collections.Interfaces;

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        System.out.println("===== QUEUE INTERFACE METHODS =====\n");
        
        Queue<Integer> queue = new LinkedList<>();
        
        System.out.println("1. add(E element) - Add at rear (throws exception): O(1)");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("   " + queue);
        
        System.out.println("\n2. offer(E element) - Add at rear (returns false): O(1)");
        queue.offer(40);
        System.out.println("   " + queue);
        
        System.out.println("\n3. remove() - Remove from front (throws exception): O(1)");
        int removed = queue.remove();
        System.out.println("   Removed: " + removed);
        System.out.println("   Queue: " + queue);
        
        System.out.println("\n4. poll() - Remove from front (returns null): O(1)");
        removed = queue.poll();
        System.out.println("   Polled: " + removed);
        System.out.println("   Queue: " + queue);
        
        System.out.println("\n5. element() - Peek front (throws exception): O(1)");
        System.out.println("   Front element: " + queue.element());
        
        System.out.println("\n6. peek() - Peek front (returns null): O(1)");
        System.out.println("   Peek: " + queue.peek());
        
        System.out.println("\n7. size() - Get size: O(1)");
        System.out.println("   Size: " + queue.size());
        
        System.out.println("\n8. isEmpty() - Check if empty: O(1)");
        System.out.println("   Is empty: " + queue.isEmpty());
        
        System.out.println("\n=== IMPLEMENTATIONS ===");
        demonstrateLinkedListQueue();
        demonstratePriorityQueue();
        demonstrateArrayDeque();
    }
    
    public static void demonstrateLinkedListQueue() {
        System.out.println("\n--- LinkedList as Queue (FIFO) ---");
        Queue<String> queue = new LinkedList<>();
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");
        System.out.println("Queue: " + queue);
        System.out.println("Serving: " + queue.poll()); // FIFO
        System.out.println("Remaining: " + queue);
        System.out.println("Time: add O(1), poll O(1), peek O(1)");
        System.out.println("Use: Task scheduling, BFS");
    }
    
    public static void demonstratePriorityQueue() {
        System.out.println("\n--- PriorityQueue (Min Heap by default) ---");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll (min): " + pq.poll()); // 10
        System.out.println("Remaining: " + pq);
        System.out.println("Time: add O(log n), poll O(log n), peek O(1)");
        System.out.println("Use: Dijkstra's algorithm, task scheduling with priority");
    }
    
    public static void demonstrateArrayDeque() {
        System.out.println("\n--- ArrayDeque (Double-Ended Queue) ---");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println("Deque: " + deque);
        System.out.println("Poll front: " + deque.pollFirst()); // A
        System.out.println("Poll rear: " + deque.pollLast());   // C
        System.out.println("Remaining: " + deque);
        System.out.println("Time: add O(1), poll O(1)");
        System.out.println("Use: Stack & Queue hybrid, sliding window");
    }
}
