// STACK IMPLEMENTATIONS AND APPLICATIONS
package Collections.Stack;

import java.util.*;

public class StackImplementations {
    public static void main(String[] args) {
        System.out.println("===== STACK IMPLEMENTATIONS AND APPLICATIONS =====\n");
        
        basicStackOperations();
        balancedParentheses();
        expressionConversion();
        undoRedoSystem();
        historyTracking();
        towerOfHanoi();
        comparisonWithDeque();
    }
    
    public static void basicStackOperations() {
        System.out.println("\n--- BASIC STACK OPERATIONS ---");
        
        System.out.println("\n1. Push and Pop");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After push: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
        
        System.out.println("\n2. Peek and Size");
        System.out.println("Peek (top): " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.empty());
        
        System.out.println("\n3. Search Element");
        stack.push(40);
        int position = stack.search(20);
        System.out.println("Position of 20 from top: " + position);
        System.out.println("Position of 99 (not found): " + stack.search(99));
    }
    
    public static void balancedParentheses() {
        System.out.println("\n--- BALANCED PARENTHESES CHECK ---");
        
        String[] expressions = {
            "({[]})",
            "({[)}",
            "((()))",
            "([{}])"
        };
        
        System.out.println("Checking balanced parentheses:\n");
        for(String expr : expressions) {
            System.out.println(expr + " -> " + isBalanced(expr));
        }
    }
    
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );
        
        for(char c : expr.toCharArray()) {
            if(pairs.values().contains(c)) {
                stack.push(c);
            } else if(pairs.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void expressionConversion() {
        System.out.println("\n--- INFIX TO POSTFIX CONVERSION ---");
        
        String[] expressions = {
            "2+3*4",
            "(2+3)*4",
            "5*6+7"
        };
        
        System.out.println("Converting expressions:\n");
        for(String expr : expressions) {
            System.out.println("Infix: " + expr);
            System.out.println("Postfix: " + infixToPostfix(expr));
            System.out.println();
        }
    }
    
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for(char c : infix.toCharArray()) {
            if(Character.isDigit(c)) {
                result.append(c);
            } else if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    
    static int precedence(char op) {
        if(op == '+' || op == '-') return 1;
        if(op == '*' || op == '/') return 2;
        return 0;
    }
    
    public static void undoRedoSystem() {
        System.out.println("\n--- UNDO/REDO SYSTEM ---");
        
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        String currentState = "";
        
        System.out.println("Simulating text editor:\n");
        
        // Action 1
        System.out.println("1. Type 'Hello'");
        undoStack.push(currentState);
        currentState = "Hello";
        System.out.println("   Current: '" + currentState + "'");
        
        // Action 2
        System.out.println("\n2. Type ' World'");
        undoStack.push(currentState);
        currentState = "Hello World";
        System.out.println("   Current: '" + currentState + "'");
        
        // Action 3
        System.out.println("\n3. Type '!'");
        undoStack.push(currentState);
        currentState = "Hello World!";
        System.out.println("   Current: '" + currentState + "'");
        
        // Undo
        System.out.println("\n4. Undo");
        redoStack.push(currentState);
        currentState = undoStack.pop();
        System.out.println("   Current: '" + currentState + "'");
        
        // Undo again
        System.out.println("\n5. Undo");
        redoStack.push(currentState);
        currentState = undoStack.pop();
        System.out.println("   Current: '" + currentState + "'");
        
        // Redo
        System.out.println("\n6. Redo");
        undoStack.push(currentState);
        currentState = redoStack.pop();
        System.out.println("   Current: '" + currentState + "'");
    }
    
    public static void historyTracking() {
        System.out.println("\n--- BROWSER HISTORY ---");
        
        Stack<String> history = new Stack<>();
        String currentPage = "google.com";
        
        System.out.println("Browsing history:\n");
        
        System.out.println("Visit: " + currentPage);
        history.push(currentPage);
        
        currentPage = "github.com";
        System.out.println("Visit: " + currentPage);
        history.push(currentPage);
        
        currentPage = "stackoverflow.com";
        System.out.println("Visit: " + currentPage);
        history.push(currentPage);
        
        System.out.println("\nPress Back:");
        currentPage = history.pop();
        System.out.println("Go to: " + currentPage);
        
        System.out.println("\nPress Back:");
        currentPage = history.pop();
        System.out.println("Go to: " + currentPage);
    }
    
    public static void towerOfHanoi() {
        System.out.println("\n--- TOWER OF HANOI ---");
        
        int n = 3;
        System.out.println("Solving Tower of Hanoi with " + n + " disks:\n");
        
        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        
        // Initialize source
        for(int i = n; i >= 1; i--) {
            source.push(i);
        }
        
        System.out.println("Initial state:");
        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Destination: " + destination);
        
        System.out.println("\nMoves needed: " + (Math.pow(2, n) - 1));
        
        // Simple moves for n=3
        System.out.println("\nSome moves:");
        System.out.println("Move disk from Source to Destination");
        System.out.println("Move disk from Source to Auxiliary");
        System.out.println("... (total " + (int)(Math.pow(2, n) - 1) + " moves)");
    }
    
    public static void comparisonWithDeque() {
        System.out.println("\n\n--- STACK vs DEQUE vs VECTOR ---");
        
        System.out.println("\nStack (Legacy):");
        System.out.println("- Extends Vector (synchronized, slow)");
        System.out.println("- LIFO operations");
        System.out.println("- Use: Deque<Integer> stack = new ArrayDeque<>() instead");
        
        System.out.println("\nDeque<Integer> stack = new ArrayDeque<>():");
        System.out.println("- Push/pop O(1)");
        System.out.println("- Not synchronized");
        System.out.println("- Efficient for large data");
        System.out.println("- Recommended for new code");
        
        System.out.println("\nPerformance comparison:");
        long start;
        
        // Stack
        Stack<Integer> stack = new Stack<>();
        start = System.nanoTime();
        for(int i = 0; i < 100000; i++) stack.push(i);
        for(int i = 0; i < 100000; i++) stack.pop();
        long stackTime = System.nanoTime() - start;
        
        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        start = System.nanoTime();
        for(int i = 0; i < 100000; i++) deque.push(i);
        for(int i = 0; i < 100000; i++) deque.pop();
        long dequeTime = System.nanoTime() - start;
        
        System.out.println("Stack: " + stackTime + " ns");
        System.out.println("ArrayDeque: " + dequeTime + " ns");
        System.out.println("Deque is " + (stackTime/dequeTime) + "x faster");
    }
}
