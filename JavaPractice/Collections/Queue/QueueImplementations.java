// QUEUE IMPLEMENTATIONS - LinkedList Queue, PriorityQueue, ArrayDeque
package Collections.Queue;

import java.util.*;

public class QueueImplementations {
    public static void main(String[] args) {
        System.out.println("===== QUEUE IMPLEMENTATIONS =====\n");
        
        linkedListQueuePrograms();
        priorityQueuePrograms();
        arrayDequePrograms();
        practicalApplications();
        comparisonOfQueues();
    }
    
    public static void linkedListQueuePrograms() {
        System.out.println("\n--- LINKEDLIST QUEUE (FIFO) ---");
        
        System.out.println("\n1. Basic Queue Operations");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after adding: " + queue);
        
        System.out.println("\n2. Peek and Poll");
        System.out.println("Peek (front): " + queue.peek());
        System.out.println("Poll (remove): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        
        System.out.println("\n3. Customer Queue Simulation");
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");
        System.out.println("Queue: " + customerQueue);
        System.out.println("Serving: " + customerQueue.poll());
        System.out.println("Next: " + customerQueue.peek());
        
        System.out.println("\n4. Queue with Offer and Remove");
        Queue<Character> chars = new LinkedList<>();
        chars.offer('A'); // Returns false on failure
        chars.offer('B');
        chars.offer('C');
        System.out.println("Queue: " + chars);
        System.out.println("Remove: " + chars.remove());
        System.out.println("Remaining: " + chars);
    }
    
    public static void priorityQueuePrograms() {
        System.out.println("\n--- PRIORITYQUEUE (Min Heap by default) ---");
        
        System.out.println("\n1. Min Heap (Natural Order)");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);
        System.out.println("Added: [50, 20, 40, 10, 30]");
        System.out.print("Poll order: ");
        while(!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        
        System.out.println("\n2. Max Heap (Reverse Order)");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(30);
        System.out.println("Added: [50, 20, 40, 10, 30]");
        System.out.print("Poll order: ");
        while(!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
        
        System.out.println("\n3. Task Scheduling by Priority");
        PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
        tasks.add(new Task("Write report", 2));
        tasks.add(new Task("Fix bug", 1));
        tasks.add(new Task("Send email", 3));
        System.out.println("Tasks (by priority):");
        while(!tasks.isEmpty()) {
            Task t = tasks.poll();
            System.out.println("  Priority " + t.getPriority() + ": " + t.getName());
        }
        
        System.out.println("\n4. Kth Largest Element");
        PriorityQueue<Integer> kth = new PriorityQueue<>();
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int k = 3;
        for(int num : nums) {
            kth.add(num);
            if(kth.size() > k) kth.poll();
        }
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println(k + "th largest: " + kth.peek());
    }
    
    public static void arrayDequePrograms() {
        System.out.println("\n--- ARRAYDEQUE (Double-Ended Queue) ---");
        
        System.out.println("\n1. Basic Deque Operations");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        System.out.println("After add: " + deque);
        
        System.out.println("\n2. Remove from Both Ends");
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("Remaining: " + deque);
        
        System.out.println("\n3. Deque as Stack");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack (using Deque): " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Remaining: " + stack);
        
        System.out.println("\n4. Deque as Queue");
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue (using Deque): " + queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println("Remaining: " + queue);
        
        System.out.println("\n5. Palindrome Check");
        String text = "racecar";
        Deque<Character> chars = new ArrayDeque<>();
        for(char c : text.toCharArray()) {
            chars.add(c);
        }
        boolean isPalindrome = true;
        while(chars.size() > 1) {
            if(chars.removeFirst() != chars.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Text: " + text);
        System.out.println("Is palindrome: " + isPalindrome);
    }
    
    public static void practicalApplications() {
        System.out.println("\n\n--- PRACTICAL APPLICATIONS ---");
        
        System.out.println("\n1. BFS (Breadth-First Search)");
        System.out.println("Graph: 1 -> [2, 3], 2 -> [4], 3 -> [5]");
        Queue<Integer> bfsQueue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        bfsQueue.add(1);
        visited.add(1);
        System.out.print("BFS Traversal: ");
        while(!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            System.out.print(node + " ");
            // Add neighbors (simplified)
            if(node == 1) { bfsQueue.add(2); bfsQueue.add(3); visited.add(2); visited.add(3); }
            else if(node == 2) { bfsQueue.add(4); visited.add(4); }
            else if(node == 3) { bfsQueue.add(5); visited.add(5); }
        }
        System.out.println();
        
        System.out.println("\n2. Sliding Window Maximum");
        int[] arr = {1, 3, 1, 2, 0, 5};
        int windowSize = 3;
        Deque<Integer> window = new ArrayDeque<>();
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Window size: " + windowSize);
        System.out.print("Max in each window: ");
        for(int i = 0; i < arr.length; i++) {
            if(!window.isEmpty() && window.peekFirst() < i - windowSize + 1) {
                window.pollFirst();
            }
            while(!window.isEmpty() && arr[window.peekLast()] < arr[i]) {
                window.pollLast();
            }
            window.add(i);
            if(i >= windowSize - 1) {
                System.out.print(arr[window.peekFirst()] + " ");
            }
        }
        System.out.println();
    }
    
    public static void comparisonOfQueues() {
        System.out.println("\n\n===== QUEUE COMPARISON =====");
        System.out.println("\nLinkedList Queue:");
        System.out.println("- FIFO behavior");
        System.out.println("- O(1) add and poll");
        System.out.println("- Best for BFS, task queue");
        
        System.out.println("\nPriorityQueue:");
        System.out.println("- Elements retrieved by priority");
        System.out.println("- O(log n) add and poll");
        System.out.println("- Min heap by default");
        System.out.println("- Best for task scheduling, Dijkstra");
        
        System.out.println("\nArrayDeque:");
        System.out.println("- Both ends accessible");
        System.out.println("- O(1) operations at both ends");
        System.out.println("- Can be stack or queue");
        System.out.println("- More efficient than Stack and LinkedList");
    }
    
    // Helper class for Task
    static class Task {
        String name;
        int priority;
        
        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
        
        String getName() { return name; }
        int getPriority() { return priority; }
    }
}
