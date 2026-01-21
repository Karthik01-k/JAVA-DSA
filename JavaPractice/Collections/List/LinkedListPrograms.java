// LinkedList Programs - Doubly Linked List Implementation
package Collections.List;

import java.util.*;

public class LinkedListPrograms {
    public static void main(String[] args) {
        System.out.println("===== LINKEDLIST PROGRAMS =====\n");
        
        basicOperations();
        addFirstLast();
        removeFirstLast();
        queueOperations();
        stackOperations();
        reverseLinkedList();
        detectCycle();
        mergeLinkedLists();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC OPERATIONS ---");
        LinkedList<String> list = new LinkedList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println("LinkedList: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
    
    public static void addFirstLast() {
        System.out.println("\n--- ADD FIRST AND LAST ---");
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2, 3, 4));
        
        System.out.println("Original: " + list);
        
        list.addFirst(1);
        System.out.println("After addFirst(1): " + list);
        
        list.addLast(5);
        System.out.println("After addLast(5): " + list);
    }
    
    public static void removeFirstLast() {
        System.out.println("\n--- REMOVE FIRST AND LAST ---");
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Start", "A", "B", "C", "End"));
        
        System.out.println("Original: " + list);
        
        String first = list.removeFirst();
        System.out.println("Removed first: " + first);
        System.out.println("Result: " + list);
        
        String last = list.removeLast();
        System.out.println("Removed last: " + last);
        System.out.println("Result: " + list);
    }
    
    public static void queueOperations() {
        System.out.println("\n--- QUEUE OPERATIONS (FIFO) ---");
        LinkedList<Integer> queue = new LinkedList<>();
        
        // Enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue after enqueue: " + queue);
        
        // Dequeue
        int first = queue.poll();
        System.out.println("Dequeued: " + first);
        System.out.println("Queue after dequeue: " + queue);
        
        // Peek
        System.out.println("Front element: " + queue.peek());
    }
    
    public static void stackOperations() {
        System.out.println("\n--- STACK OPERATIONS (LIFO) ---");
        LinkedList<String> stack = new LinkedList<>();
        
        // Push
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack after push: " + stack);
        
        // Pop
        String top = stack.pop();
        System.out.println("Popped: " + top);
        System.out.println("Stack after pop: " + stack);
        
        // Peek
        System.out.println("Top element: " + stack.peek());
    }
    
    public static void reverseLinkedList() {
        System.out.println("\n--- REVERSE LINKEDLIST ---");
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        System.out.println("Original: " + list);
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
    
    public static void detectCycle() {
        System.out.println("\n--- DETECT CYCLE (Simulated) ---");
        System.out.println("Cycle detection typically uses Floyd's algorithm:");
        System.out.println("1. Two pointers: slow (moves 1 step), fast (moves 2 steps)");
        System.out.println("2. If they meet, cycle exists");
        System.out.println("3. If fast reaches end, no cycle");
    }
    
    public static void mergeLinkedLists() {
        System.out.println("\n--- MERGE TWO LINKEDLISTS ---");
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        
        list1.addAll(list2);
        Collections.sort(list1);
        
        System.out.println("Merged and sorted: " + list1);
    }
}
