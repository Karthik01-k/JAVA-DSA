// PriorityQueue Programs - Min/Max Heap Implementation
package Collections.Queue;

import java.util.*;

public class PriorityQueuePrograms {
    public static void main(String[] args) {
        System.out.println("===== PRIORITYQUEUE PROGRAMS =====\n");
        
        minHeap();
        maxHeap();
        taskScheduling();
        kthLargestElement();
        kthSmallestElement();
    }
    
    public static void minHeap() {
        System.out.println("\n--- MIN HEAP (Default) ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);
        
        System.out.println("Added: [50, 20, 40, 10, 30]");
        System.out.print("Poll order (min first): ");
        
        while(!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
    
    public static void maxHeap() {
        System.out.println("\n--- MAX HEAP (Custom) ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(30);
        
        System.out.println("Added: [50, 20, 40, 10, 30]");
        System.out.print("Poll order (max first): ");
        
        while(!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
    
    public static void taskScheduling() {
        System.out.println("\n--- TASK SCHEDULING BY PRIORITY ---");
        PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority));
        
        tasks.add(new Task("Write documentation", 3));
        tasks.add(new Task("Fix critical bug", 1));
        tasks.add(new Task("Send email", 4));
        tasks.add(new Task("Code review", 2));
        tasks.add(new Task("Update dependencies", 5));
        
        System.out.println("Tasks in priority order (1=highest):");
        int order = 1;
        while(!tasks.isEmpty()) {
            Task t = tasks.poll();
            System.out.println("  " + order + ". [Priority " + t.getPriority() + "] " + t.getName());
            order++;
        }
    }
    
    public static void kthLargestElement() {
        System.out.println("\n--- KTH LARGEST ELEMENT ---");
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int num : arr) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("K: " + k);
        System.out.println("Kth largest: " + minHeap.peek());
        System.out.println("(Using min heap to keep k largest elements)");
    }
    
    public static void kthSmallestElement() {
        System.out.println("\n--- KTH SMALLEST ELEMENT ---");
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int num : arr) {
            maxHeap.add(num);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("K: " + k);
        System.out.println("Kth smallest: " + maxHeap.peek());
        System.out.println("(Using max heap to keep k smallest elements)");
    }
    
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
