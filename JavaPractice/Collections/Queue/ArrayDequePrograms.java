// ArrayDeque Programs - Double-Ended Queue Implementation
package Collections.Queue;

import java.util.*;

public class ArrayDequePrograms {
    public static void main(String[] args) {
        System.out.println("===== ARRAYDEQUE PROGRAMS =====\n");
        
        doubleEndedQueue();
        dequeAsStack();
        dequeAsQueue();
        palindromeCheck();
        slidingWindowMinimum();
    }
    
    public static void doubleEndedQueue() {
        System.out.println("\n--- DOUBLE-ENDED QUEUE ---");
        Deque<String> deque = new ArrayDeque<>();
        
        // Add at both ends
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        System.out.println("After add: " + deque);
        
        // Remove from both ends
        String first = deque.removeFirst();
        String last = deque.removeLast();
        System.out.println("Removed first: " + first);
        System.out.println("Removed last: " + last);
        System.out.println("Remaining: " + deque);
        
        // Peek both ends
        deque.addFirst("X");
        deque.addLast("Z");
        System.out.println("After adding X and Z: " + deque);
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());
    }
    
    public static void dequeAsStack() {
        System.out.println("\n--- DEQUE AS STACK (LIFO) ---");
        Deque<Integer> stack = new ArrayDeque<>();
        
        // Push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        
        // Pop
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Remaining: " + stack);
        
        System.out.println("\nNote: Deque is more efficient than Stack class");
    }
    
    public static void dequeAsQueue() {
        System.out.println("\n--- DEQUE AS QUEUE (FIFO) ---");
        Deque<String> queue = new ArrayDeque<>();
        
        // Enqueue
        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");
        System.out.println("Queue: " + queue);
        
        // Dequeue
        System.out.println("Serve: " + queue.poll());
        System.out.println("Serve: " + queue.poll());
        System.out.println("Remaining: " + queue);
    }
    
    public static void palindromeCheck() {
        System.out.println("\n--- PALINDROME CHECK ---");
        String[] words = {"racecar", "hello", "madam", "noon", "world"};
        
        for(String word : words) {
            Deque<Character> deque = new ArrayDeque<>();
            for(char c : word.toCharArray()) {
                deque.add(c);
            }
            
            boolean isPalindrome = true;
            while(deque.size() > 1) {
                if(deque.removeFirst() != deque.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }
            
            System.out.println("\"" + word + "\" -> " + (isPalindrome ? "Palindrome" : "Not palindrome"));
        }
    }
    
    public static void slidingWindowMinimum() {
        System.out.println("\n--- SLIDING WINDOW MINIMUM ---");
        int[] arr = {1, 3, 1, 2, 0, 5};
        int k = 3;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Window size: " + k);
        System.out.println("\nMinimum in each window:");
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++) {
            // Remove elements outside window
            if(!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove larger elements
            while(!deque.isEmpty() && arr[deque.peekLast()] > arr[i]) {
                deque.pollLast();
            }
            
            deque.add(i);
            
            // Print minimum of current window
            if(i >= k - 1) {
                System.out.print("Window [" + (i - k + 1) + ", " + i + "]: " + 
                               arr[deque.peekFirst()] + "\n");
            }
        }
    }
}
