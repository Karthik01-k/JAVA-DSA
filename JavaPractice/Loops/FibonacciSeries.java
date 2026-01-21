// LeetCode Problem: Similar to Fibonacci calculations
// Related: LeetCode 509 - Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/
//
// APPROACH:
// 1. Initialize first two numbers: a=0, b=1
// 2. Print first two numbers
// 3. Use loop to generate next numbers: c = a + b
// 4. Update variables: a = b, b = c
// 5. Continue for n terms
// 6. Time: O(n), Space: O(1)

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}