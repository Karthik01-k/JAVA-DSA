// LinkedList Queue Programs - FIFO Queue Implementation
package Collections.Queue;

import java.util.*;

public class LinkedListQueuePrograms {
    public static void main(String[] args) {
        System.out.println("===== LINKEDLIST QUEUE PROGRAMS =====\n");
        
        basicQueueOperations();
        customerQueueSimulation();
        bfsTraversal();
        slidingWindowMax();
    }
    
    public static void basicQueueOperations() {
        System.out.println("\n--- BASIC QUEUE OPERATIONS (FIFO) ---");
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add: " + queue);
        
        // Peek
        System.out.println("Peek (front): " + queue.peek());
        
        // Poll
        int front = queue.poll();
        System.out.println("Poll (remove): " + front);
        System.out.println("Queue after poll: " + queue);
        
        // Offer
        queue.offer(40);
        System.out.println("After offer(40): " + queue);
        
        // Size and isEmpty
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
    
    public static void customerQueueSimulation() {
        System.out.println("\n--- CUSTOMER SERVICE QUEUE ---");
        Queue<String> customerQueue = new LinkedList<>();
        
        // Customers arrive
        customerQueue.add("Customer A");
        customerQueue.add("Customer B");
        customerQueue.add("Customer C");
        customerQueue.add("Customer D");
        
        System.out.println("Queue: " + customerQueue);
        
        // Serve customers
        System.out.println("\nServing customers:");
        int counter = 1;
        while(!customerQueue.isEmpty()) {
            String customer = customerQueue.poll();
            System.out.println("  Counter " + counter + ": Serving " + customer);
            counter++;
        }
        
        System.out.println("Queue empty: " + customerQueue.isEmpty());
    }
    
    public static void bfsTraversal() {
        System.out.println("\n--- BREADTH-FIRST SEARCH (BFS) ---");
        System.out.println("Graph structure:");
        System.out.println("    1");
        System.out.println("   / \\");
        System.out.println("  2   3");
        System.out.println(" / \\   \\");
        System.out.println("4   5   6");
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(1);
        visited.add(1);
        
        System.out.println("\nBFS Traversal: ");
        System.out.print("Order: ");
        
        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            
            // Add neighbors (simplified adjacency list)
            int[] neighbors = getNeighbors(node);
            for(int neighbor : neighbors) {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    
    public static void slidingWindowMax() {
        System.out.println("\n--- SLIDING WINDOW MAXIMUM ---");
        int[] arr = {1, 3, 1, 2, 0, 5};
        int k = 3;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Window size: " + k);
        System.out.println("\nMaximum in each window:");
        
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            // Remove elements outside window
            if(!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove smaller elements
            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            
            deque.add(i);
            
            // Add maximum of current window
            if(i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
                System.out.print("Window [" + (i - k + 1) + ", " + i + "]: " + 
                               arr[deque.peekFirst()] + "\n");
            }
        }
    }
    
    // Helper method for neighbors in BFS
    static int[] getNeighbors(int node) {
        return switch(node) {
            case 1 -> new int[]{2, 3};
            case 2 -> new int[]{4, 5};
            case 3 -> new int[]{6};
            default -> new int[]{};
        };
    }
}
