// LeetCode Problem: Similar to mathematical calculations
// Related: LeetCode 172 - Factorial Trailing Zeroes
// https://leetcode.com/problems/factorial-trailing-zeroes/
//
// BRUTE FORCE APPROACH (Recursive):
// 1. Base case: if n <= 1, return 1
// 2. Recursive case: return n * factorial(n-1)
// 3. Time: O(n), Space: O(n) due to recursion stack
/*
public static long factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
*/
//
// OPTIMIZED APPROACH (Iterative):
// 1. Initialize result variable to 1
// 2. Use for loop from 1 to n
// 3. Multiply result by each number: result *= i
// 4. Use long to avoid integer overflow
// 5. Time: O(n), Space: O(1)
/*
long fact = 1;
for (int i = 1; i <= n; i++) {
    fact *= i;
}
*/
//
// EDGE CASES:
// - n = 0 (factorial is 1)
// - n = 1 (factorial is 1)
// - Large n causing overflow
// - Negative n (undefined)

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}