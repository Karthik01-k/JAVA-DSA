// Deque as Stack Programs - Better Alternative to Stack Class
package Collections.Stack;

import java.util.*;

public class DequeStackPrograms {
    public static void main(String[] args) {
        System.out.println("===== DEQUE AS STACK PROGRAMS =====\n");
        
        System.out.println("WHY USE DEQUE INSTEAD OF STACK:");
        System.out.println("1. Stack extends Vector (legacy, synchronized)");
        System.out.println("2. Deque<T> deque = new ArrayDeque<>() is faster");
        System.out.println("3. ArrayDeque is more efficient than Stack");
        System.out.println("4. Modern Java recommends Deque for stack behavior\n");
        
        basicOperations();
        undoRedoSystem();
        decimalToBinary();
        performanceComparison();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC DEQUE STACK OPERATIONS ---");
        Deque<String> stack = new ArrayDeque<>();
        
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Deque stack: " + stack);
        
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
    }
    
    public static void undoRedoSystem() {
        System.out.println("\n--- UNDO/REDO SYSTEM ---");
        Deque<String> undoStack = new ArrayDeque<>();
        Deque<String> redoStack = new ArrayDeque<>();
        String currentState = "";
        
        System.out.println("Simulating text editor:");
        
        // Actions
        System.out.println("\n1. Type 'Hello'");
        undoStack.push(currentState);
        currentState = "Hello";
        redoStack.clear();
        System.out.println("   Current: '" + currentState + "'");
        
        System.out.println("\n2. Type ' World'");
        undoStack.push(currentState);
        currentState = "Hello World";
        redoStack.clear();
        System.out.println("   Current: '" + currentState + "'");
        
        System.out.println("\n3. Type '!'");
        undoStack.push(currentState);
        currentState = "Hello World!";
        redoStack.clear();
        System.out.println("   Current: '" + currentState + "'");
        
        // Undo
        System.out.println("\n4. Undo");
        redoStack.push(currentState);
        currentState = undoStack.pop();
        System.out.println("   Current: '" + currentState + "'");
        
        // Redo
        System.out.println("\n5. Redo");
        undoStack.push(currentState);
        currentState = redoStack.pop();
        System.out.println("   Current: '" + currentState + "'");
    }
    
    public static void decimalToBinary() {
        System.out.println("\n--- DECIMAL TO BINARY CONVERSION ---");
        int[] numbers = {13, 25, 100};
        
        for(int num : numbers) {
            Deque<Integer> stack = new ArrayDeque<>();
            int n = num;
            
            while(n > 0) {
                stack.push(n % 2);
                n /= 2;
            }
            
            System.out.print(num + " -> ");
            while(!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
    
    public static void performanceComparison() {
        System.out.println("\n--- PERFORMANCE COMPARISON ---");
        
        int operations = 1000000;
        
        // Stack performance
        long start = System.nanoTime();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < operations; i++) {
            stack.push(i);
        }
        for(int i = 0; i < operations; i++) {
            stack.pop();
        }
        long stackTime = System.nanoTime() - start;
        
        // ArrayDeque performance
        start = System.nanoTime();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < operations; i++) {
            deque.push(i);
        }
        for(int i = 0; i < operations; i++) {
            deque.pop();
        }
        long dequeTime = System.nanoTime() - start;
        
        System.out.println("Operations: " + (operations * 2));
        System.out.println("Stack time: " + (stackTime / 1_000_000) + " ms");
        System.out.println("ArrayDeque time: " + (dequeTime / 1_000_000) + " ms");
        System.out.println("Speedup: " + String.format("%.2f", (double)stackTime / dequeTime) + "x faster");
        System.out.println("\nConclusion: Use ArrayDeque for better performance!");
    }
}
