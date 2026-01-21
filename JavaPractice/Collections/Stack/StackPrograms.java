// Stack Programs - LIFO Data Structure Applications
package Collections.Stack;

import java.util.*;

public class StackPrograms {
    public static void main(String[] args) {
        System.out.println("===== STACK PROGRAMS =====\n");
        
        basicOperations();
        balancedParentheses();
        reverseString();
        nextGreaterElement();
        largestRectangleInHistogram();
    }
    
    public static void basicOperations() {
        System.out.println("\n--- BASIC STACK OPERATIONS ---");
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Size: " + stack.size());
        
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
        System.out.println("Empty: " + stack.empty());
    }
    
    public static void balancedParentheses() {
        System.out.println("\n--- BALANCED PARENTHESES ---");
        String[] expressions = {
            "({[]})",
            "({[)}",
            "((()))",
            "([{}])",
            "{[}]"
        };
        
        System.out.println("Checking balanced parentheses:\n");
        for(String expr : expressions) {
            System.out.println(expr + " -> " + (isBalanced(expr) ? "Balanced" : "Not balanced"));
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
    
    public static void reverseString() {
        System.out.println("\n--- REVERSE STRING USING STACK ---");
        String str = "HELLO";
        Stack<Character> stack = new Stack<>();
        
        for(char c : str.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
    
    public static void nextGreaterElement() {
        System.out.println("\n--- NEXT GREATER ELEMENT ---");
        int[] arr = {1, 5, 0, 3, 4, 5};
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Element (to the right):\n");
        
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println("  " + arr[i] + " -> " + result[i]);
        }
    }
    
    public static void largestRectangleInHistogram() {
        System.out.println("\n--- LARGEST RECTANGLE IN HISTOGRAM ---");
        int[] heights = {2, 1, 5, 6, 2, 3};
        
        System.out.println("Heights: " + Arrays.toString(heights));
        
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        
        for(int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = h * w;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int w = stack.isEmpty() ? heights.length : heights.length - stack.peek() - 1;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
        }
        
        System.out.println("Largest rectangle area: " + maxArea);
    }
}
