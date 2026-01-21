// Stack Class - LIFO (Last In First Out) Collection
// Implementations: Stack (extends Vector), Deque implementations
// Key Methods Documentation

package Collections.Interfaces;

import java.util.*;

public class StackInterface {
    public static void main(String[] args) {
        System.out.println("===== STACK INTERFACE METHODS =====\n");
        
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("1. push(E item) - Add element on top: O(1)");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("   " + stack);
        
        System.out.println("\n2. pop() - Remove from top (throws exception): O(1)");
        int popped = stack.pop();
        System.out.println("   Popped: " + popped);
        System.out.println("   Stack: " + stack);
        
        System.out.println("\n3. peek() - View top element: O(1)");
        System.out.println("   Top element: " + stack.peek());
        
        System.out.println("\n4. empty() - Check if stack is empty: O(1)");
        System.out.println("   Is empty: " + stack.empty());
        
        System.out.println("\n5. search(Object o) - Search element: O(n)");
        int position = stack.search(10);
        System.out.println("   Position of 10 from top: " + position);
        System.out.println("   Position of 99: " + stack.search(99));
        
        System.out.println("\n6. size() - Get size: O(1)");
        System.out.println("   Size: " + stack.size());
        
        System.out.println("\n=== PRACTICAL EXAMPLES ===");
        
        // Example 1: Balanced Parentheses
        System.out.println("\n--- Example 1: Balanced Parentheses ---");
        String expr1 = "({[]})";
        String expr2 = "({[})";
        System.out.println("Expression: " + expr1 + " -> " + isBalanced(expr1));
        System.out.println("Expression: " + expr2 + " -> " + isBalanced(expr2));
        
        // Example 2: Reverse a String
        System.out.println("\n--- Example 2: Reverse String ---");
        String str = "HELLO";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverseString(str));
        
        // Example 3: Decimal to Binary
        System.out.println("\n--- Example 3: Decimal to Binary ---");
        int num = 13;
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + decimalToBinary(num));
        
        // Example 4: Undo/Redo functionality
        System.out.println("\n--- Example 4: Undo/Redo Functionality ---");
        demonstrateUndoRedo();
        
        // Example 5: Using Deque as Stack
        System.out.println("\n--- Example 5: Deque as Stack ---");
        demonstrateDequeStack();
    }
    
    // Check balanced parentheses
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );
        
        for(char c : expr.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(pairs.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    // Reverse string using stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    
    // Convert decimal to binary
    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        while(num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    
    // Undo/Redo functionality
    public static void demonstrateUndoRedo() {
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        String currentState = "";
        
        // Simulate actions
        System.out.println("Action 1: Type 'Hello'");
        currentState = "Hello";
        undoStack.push(currentState);
        System.out.println("Current: " + currentState);
        
        System.out.println("\nAction 2: Type ' World'");
        currentState = "Hello World";
        undoStack.push(currentState);
        System.out.println("Current: " + currentState);
        
        System.out.println("\nUndo:");
        redoStack.push(currentState);
        currentState = undoStack.pop();
        System.out.println("Current: " + currentState);
        
        System.out.println("\nRedo:");
        undoStack.push(currentState);
        currentState = redoStack.pop();
        System.out.println("Current: " + currentState);
    }
    
    // Deque as Stack
    public static void demonstrateDequeStack() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Deque as Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Remaining: " + stack);
        System.out.println("More efficient than Stack class for large data");
    }
}
