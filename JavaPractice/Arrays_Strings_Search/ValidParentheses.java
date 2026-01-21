// LeetCode Problem: Exact match
// LeetCode 20 - Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
//
// PATTERN RECOGNITION:
// - Need to match opening and closing brackets in correct order
// - Last opened bracket should be first to close (LIFO)
// - Pattern: "Stack" - perfect for nested/balanced structures
// - Key insight: push opening brackets, pop and match closing brackets
// - Similar problems: Valid Parenthesis String, Remove Invalid Parentheses
//
// BRUTE FORCE APPROACH:
// 1. Use counter for each bracket type
// 2. Increment for opening, decrement for closing
// 3. Check if all counters are zero at end
// 4. Problem: doesn't handle order (e.g., ")(") 
// 5. Time: O(n), Space: O(1) but incorrect logic
/*
int round = 0, square = 0, curly = 0;
for (char c : s.toCharArray()) {
    if (c == '(') round++; else if (c == ')') round--;
    if (c == '[') square++; else if (c == ']') square--;
    if (c == '{') curly++; else if (c == '}') curly--;
}
return round == 0 && square == 0 && curly == 0; // WRONG!
*/
//
// OPTIMIZED APPROACH (Stack):
// 1. Use Stack data structure
// 2. For opening brackets: push to stack
// 3. For closing brackets: check if stack is empty or top doesn't match
// 4. Pop from stack if valid pair found
// 5. At end, stack should be empty for valid string
// 6. Time: O(n), Space: O(n)
/*
Stack<Character> stack = new Stack<>();
for (char c : s.toCharArray()) {
    if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
    } else {
        if (stack.isEmpty()) return false;
        char top = stack.pop();
        if ((c == ')' && top != '(') || 
            (c == ']' && top != '[') || 
            (c == '}' && top != '{')) return false;
    }
}
return stack.isEmpty();
*/
//
// EDGE CASES:
// - Empty string (valid)
// - Only opening brackets
// - Only closing brackets
// - Mismatched brackets like "([)]"
// - Single character

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty() ? "Valid" : "Invalid");
    }
}